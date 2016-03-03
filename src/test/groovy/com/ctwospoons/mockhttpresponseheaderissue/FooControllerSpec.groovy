package com.ctwospoons.mockhttpresponseheaderissue

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(FooController)
class FooControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test index setIntHeader"() {
        when:
            controller.integerResponseHeader()
        then:
            response.getHeaderValue('Content-length') == 5
    }

    void "test index setHeader Content-length with String"(){
        when:
            controller.stringResponseHeader()
        then:
            response.getHeaderValue('Content-length') == 5
    }
}
