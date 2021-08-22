package dk.sunepoulsen.timelog.users.ct

import dk.sunepoulsen.tes.springboot.ct.core.spock.DefaultDeploymentSpockExtension

class DeploymentSpockExtension extends DefaultDeploymentSpockExtension {
    static String COMPOSE_NAME = 'ct'
    static String CONTAINER_NAME = 'timelog-users-service'

    DeploymentSpockExtension() {
        super(COMPOSE_NAME, [CONTAINER_NAME])
    }
}
