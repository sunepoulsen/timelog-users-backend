package dk.sunepoulsen.timelog.users.stresstest

import dk.sunepoulsen.tes.springboot.ct.core.spock.DefaultDeploymentSpockExtension

class DeploymentSpockExtension extends DefaultDeploymentSpockExtension {
    static String COMPOSE_NAME = 'stress-tests'
    static String CONTAINER_NAME = 'timelog-users-service'

    DeploymentSpockExtension() {
        super(COMPOSE_NAME, [CONTAINER_NAME])
    }
}
