package dk.sunepoulsen.timelog.users.ct

import dk.sunepoulsen.tes.springboot.ct.core.http.HttpHelper
import dk.sunepoulsen.tes.springboot.ct.core.verification.HttpResponseVerificator
import org.junit.Test
import spock.lang.Specification

class SwaggerSpec extends Specification {

    private HttpHelper httpHelper

    void setup() {
        this.httpHelper = new HttpHelper(DeploymentSpockExtension.deployment)
    }

    @Test
    void "GET /swagger-ui.html returns OK"() {
        given: 'Health service is available'
            DeploymentSpockExtension.deployment.waitForAvailable(DeploymentSpockExtension.CONTAINER_NAME)

        when: 'Call GET /swagger-ui.html'
            HttpResponseVerificator verificator = httpHelper.sendValidRequest(DeploymentSpockExtension.CONTAINER_NAME, HttpHelper.GET, '/swagger-ui.html')

        then: 'Response Code is 200'
            verificator.responseCode(200)

        and: 'Content Type is text/html'
            verificator.contentType('text/html')
    }

}
