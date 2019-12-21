# Set function
def answer():
    print("Answer!!")

def add_args(arg1, arg2):
    print(arg1 + arg2)

def sum_args(*args):
    print(sum(args))

def run_something(func):
    func()

def run_something_with_args(func, arg1, arg2):
    func(arg1, arg2)

def run_with_positional_args(func, *args):
    func(*args)

# Result test
run_something(answer)

run_something_with_args(add_args, 10, 100)

run_with_positional_args(sum_args, 1, 2, 3, 4)
