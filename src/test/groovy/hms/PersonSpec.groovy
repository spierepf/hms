package hms

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }

    void "test User extends Person"() {
        expect:"User extends Person"
            new User() instanceof Person
    }
}
