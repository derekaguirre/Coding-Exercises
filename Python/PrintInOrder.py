import threading
from typing import Callable

lock1 = threading.Lock()
lock2 = threading.Lock()
lock1.acquire()
lock2.acquire()

class Foo:
    #Submission
    #https://leetcode.com/submissions/detail/575147407/
    
    def __init__(self):
        pass

    
    # printFirst() outputs "first". Do not change or remove this line.
    def first(self, printFirst: 'Callable[[], None]') -> None:
        printFirst()
        lock1.release()
        
    # printSecond() outputs "second". Do not change or remove this line.
    def second(self, printSecond: 'Callable[[], None]') -> None:
        lock1.acquire()
        printSecond()
        lock2.release()
        

        
            
    # printThird() outputs "third". Do not change or remove this line.
    def third(self, printThird: 'Callable[[], None]') -> None:
        lock2.acquire()
        printThird()