//@GrabResolver(name='grailsSnapshots', root='http://repo.grails.org/grails/libs-snapshots-local')
@Grab("org.codehaus.groovy:groovy-templates:2.3.0-beta-1")
@Grab("org.codehaus.groovy:groovy-xml:2.3.0-beta-1")
@Grab("org.codehaus.groovy:groovy:2.3.0-beta-1")
@Grab("org.grails:grails-gsp-spring-boot:1.0.0.BUILD-SNAPSHOT")
import grails.gsp.TagLib
import org.springframework.web.servlet.ModelAndView
import java.text.SimpleDateFormat

@RestController
class GspController {
    @RequestMapping("/")
    ModelAndView home() {
        new ModelAndView('index', 'name', 'world')
    }    
}

@Component
@TagLib
class FormatTagLib {
	def dateFormat = { attrs, body ->
		out << new SimpleDateFormat(attrs.format).format(attrs.date)
	}
}