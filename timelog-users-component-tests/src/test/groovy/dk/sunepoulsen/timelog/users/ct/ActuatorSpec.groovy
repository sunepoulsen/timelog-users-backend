package dk.sunepoulsen.timelog.users.ct

import dk.sunepoulsen.tes.springboot.ct.core.http.HttpHelper
import dk.sunepoulsen.tes.springboot.ct.core.verification.HttpResponseVerificator
import spock.lang.Specification

class ActuatorSpec extends Specification {

    private HttpHelper httpHelper

    void setup() {
        this.httpHelper = new HttpHelper(DeploymentSpockExtension.deployment)
    }

    void "GET /actuator/health returns OK"() {
        given: 'Health service is available'
            DeploymentSpockExtension.deployment.waitForAvailable(DeploymentSpockExtension.CONTAINER_NAME)

        when: 'Call GET /actuator/health'
            HttpResponseVerificator verificator = httpHelper.sendValidRequest(DeploymentSpockExtension.CONTAINER_NAME, HttpHelper.GET, '/actuator/health')

        then: 'Response Code is 200'
            verificator.responseCode(200)

        and: 'Content Type is application/json'
            verificator.contentType('application/vnd.spring-boot.actuator.v3+json')

        and: 'Response body is json'
            verificator.bodyIsJson()

        and: 'Verify greetings body'
            verificator.bodyAsJson() == [
                'status': 'UP'
            ]
    }

}
