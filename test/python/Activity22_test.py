# Activity 22
# Subsets

# Using pytest:

# In the same file as the previous activity, do the following:

# Apply the marker 'activity' to the last 2 test methods.
# Run tests based on substring
# Run tests based using the 'activity' marker.


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

@pytest.mark.activity
def test_multi():
    num1 = 2
    num2 = 3
    multi = num1 * num2
    assert multi == 6

@pytest.mark.activity
def test_div():
    num1 = 6
    num2 = 3
    div = num1 / num2
    assert div == 2

