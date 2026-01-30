# Activity 21
# Calculator Test
# Using pytest:

# Create a new test file and write test to validate the following cases:

# Sum of two numbers
# Difference of two numbers
# Product of two numbers
# Quotient of two numbers

import pytest

def test_sum():
    num1 = 27
    num2 = 58
    sum = num1 + num2
    assert sum == 85

def test_diff():
    num1 = 58
    num2 = 27
    diff = num1 - num2
    assert diff == 30

def test_multi():
    num1 = 2
    num2 = 3
    multi = num1 * num2
    assert multi == 6

def test_div():
    num1 = 6
    num2 = 3
    div = num1 / num2
    assert div == 2

