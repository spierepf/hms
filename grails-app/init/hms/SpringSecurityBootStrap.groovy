package hms

class SpringSecurityBootStrap {

    def init = { servletContext ->
        def adminUser = new User(username: "admin", password: "makestuff").save(flush: true)
        def adminRole = new Role(authority: "ROLE_ADMIN").save(flush: true)
        new UserRole(user: adminUser, role: adminRole).save(flush: true)
    }
    def destroy = {
    }
}
