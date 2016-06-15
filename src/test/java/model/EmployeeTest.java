package model;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private static javax.validation.Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void evaluatesExpression() {
        Employee employee = new Employee("Andrew", "Hiles", 300000, "me@andrewhil.es");
        assertEquals(300000, employee.getSalary());
    }

    @Test
    public void testHibernateValidationFirstName() {
        Employee employee = new Employee("Andrewwwwww", "Hiles", 300000, "me@andrewhil.es");

        Set<ConstraintViolation<Employee>> constraintViolations =
                validator.validate(employee);

        assertEquals(1, constraintViolations.size());
        assertEquals("length must be between 0 and 10", constraintViolations.iterator().next().getMessage());
    }

    @Test
    public void testHibernateValidationInvalidEmailAddress() {
        Employee employee = new Employee("Andrew", "Hiles", 30000, "bad.email");

        Set<ConstraintViolation<Employee>> constraintViolations =
                validator.validate(employee);

        assertEquals(1, constraintViolations.size());
        assertEquals("not a well-formed email address", constraintViolations.iterator().next().getMessage());
    }
}
