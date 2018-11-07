package commandobject

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class CommandObjectInterceptorSpec extends Specification implements InterceptorUnitTest<CommandObjectInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test commandObject interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"commandObject")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
