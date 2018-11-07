package commandobject

class CommandObjectController {

    def index(MyCommandObject object) {
//        bindData(object, params)
        log.error "${object.businessId}"

        if (object.businessId.every { it.getClass() == Long }) {
            render "ok"
        } else {
            log.error "not a Long: ${object.businessId*.getClass()}"
            render "nok"
        }
    }
}
