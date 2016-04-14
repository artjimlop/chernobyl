package com.artjimlop.sample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static com.chernobyl.Chernobyl.checkArgument;
import static com.chernobyl.Chernobyl.checkElementIndex;
import static com.chernobyl.Chernobyl.checkNotEmpty;
import static com.chernobyl.Chernobyl.checkNotNull;
import static com.chernobyl.Chernobyl.checkState;

public class ChernobylTest {

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenCheckArgumentsNotEqual() throws Exception {
        checkArgument(1 == 0, "Not equal arguments");
    }

    @Test
    public void shouldNotThrowIllegalArgumentExceptionWhenCheckArgumentsAreEquals() throws Exception {
        checkArgument(1 == 1, "Equal arguments");
    }

    @Test(expected=IllegalStateException.class)
    public void shouldThrowIllegalArgumentExceptionWhenCheckStateFalse() throws Exception {
        checkState(false, "State is FALSE");
    }

    @Test
    public void shouldNotThrowIllegalArgumentExceptionWhenCheckStateTrue() throws Exception {
        checkState(1 == 1, "State is TRUE");
    }

    @Test(expected=NullPointerException.class)
    public void shouldThrowNullPointerExceptionWhenCheckNullOfNull() throws Exception {
        checkNotNull(null);
    }

    @Test
    public void shouldNotThrowNullPointerExceptionWhenPassingNoNull() throws Exception {
        checkNotNull(5);
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenIndexGreaterThanSize() throws Exception {
        checkElementIndex(5, 4, "index > size");
    }

    @Test(expected=IndexOutOfBoundsException.class)
    public void shouldThrowIndexOutOfBoundsExceptionWhenIndexEqualsSize() throws Exception {
        checkElementIndex(5, 5, "index == size");
    }

    @Test
    public void shouldNotThrowIndexOutOfBoundsExceptionWhenIndexLessThanSize() throws Exception {
        checkElementIndex(4, 5, "index < size");
    }

    @Test(expected=NullPointerException.class)
    public void shouldThrowNullpointeExceptionWhenPassingEmptyString() throws Exception {
        checkNotEmpty("");
    }

    @Test
    public void shouldNotThrowNullpointeExceptionWhenPassingNoEmptyString() throws Exception {
        checkNotEmpty("string");
    }

    @Test(expected=NullPointerException.class)
    public void shouldThrowNullpointeExceptionWhenPassingEmptyList() throws Exception {
        checkNotEmpty(Collections.emptyList());
    }

    @Test
    public void shouldNotThrowNullpointeExceptionWhenPassingNoEmptyList() throws Exception {
        checkNotEmpty(Collections.singletonList("element"));
    }
}
