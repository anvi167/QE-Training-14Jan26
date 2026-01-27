def count_up_to(n):
    i = 1
    while i <= n:
        yield i
        i += 1

print(list(count_up_to(4)))
print(tuple(count_up_to(4)))
print(set(count_up_to(4)))