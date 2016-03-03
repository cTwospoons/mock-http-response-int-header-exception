package com.ctwospoons.mockhttpresponseheaderissue

class FooController {

    def integerResponseHeader() {
        response.setIntHeader('Content-length', 5)
    }

    def stringResponseHeader(){
        response.setHeader('Content-length', '5')
    }
}
