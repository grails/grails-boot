package org.grails.datastore.gorm.boot.compiler

import grails.persistence.Entity
import groovy.transform.CompileStatic
import org.codehaus.groovy.ast.ClassNode
import org.codehaus.groovy.control.CompilationFailedException
import org.codehaus.groovy.control.customizers.ImportCustomizer
import org.springframework.boot.cli.compiler.AstUtils;
import org.springframework.boot.cli.compiler.CompilerAutoConfiguration
import org.springframework.boot.cli.compiler.DependencyCustomizer;

/**
 * A compiler configuration that automatically adds the necessary imports
 *
 * @author Graeme Rocher
 *
 */
@CompileStatic
class GormCompilerAutoConfiguration extends CompilerAutoConfiguration{
    @Override
    boolean matches(ClassNode classNode) {
        return AstUtils.hasAtLeastOneAnnotation(classNode, Entity.name, "Entity")
    }

    @Override
    void applyDependencies(DependencyCustomizer dependencies) throws CompilationFailedException {
        dependencies.ifAnyMissingClasses("grails.persistence.Entity")
                        .add("grails-datastore-gorm-hibernate4")
    }

    @Override
    void applyImports(ImportCustomizer imports) throws CompilationFailedException {
        imports.addStarImports("grails.persistence", "grails.gorm")
    }
}