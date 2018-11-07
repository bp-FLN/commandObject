package commandobject

import org.grails.web.converters.exceptions.ConverterException

class CommandObjectInterceptor {

    boolean before() {
        try {
//            if (request.JSON) {
//                request.JSON.each { Map.Entry node ->
//                    println node.key
//                    println node.value
//                    params.put(node.key, node.value)
//                }
//            }
        } catch (ConverterException ignore) {
            render(contentType: 'application/json', status: 400) {
                [
                        status: "ERROR",
                        message: 'Cannot parse your JSON.'
                ]
            }

            return false
        }

        return true
    }

}
