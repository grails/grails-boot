//@GrabResolver(name='grailsSnapshots', root='http://repo.grails.org/grails/libs-snapshots-local')
@Grab("org.grails:grails-gsp-spring-boot:1.0.0.BUILD-SNAPSHOT")
import grails.gsp.boot.*
import org.springframework.web.servlet.ModelAndView

@RestController
class GspController {
    @RequestMapping("/")
    ModelAndView home() {
        new ModelAndView('index', 'name', 'world')
    }    
}
