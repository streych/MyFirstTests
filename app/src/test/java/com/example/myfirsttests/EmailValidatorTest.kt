package com.example.myfirsttests

import junit.framework.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

    @Test
    fun emailValidator_NotDomainEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email."))
    }

    @Test
    fun emailValidator_TwoAtEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@@email.com"))
    }

    @Test
    fun emailValidator_RusCharEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("nameу@email.com"))
    }

    @Test
    fun emailValidator_SymbolEmail_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name}@email.com"))
    }

}