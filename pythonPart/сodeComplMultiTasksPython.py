import threading
import time

def task_1():
    print("Task 1 started")
    time.sleep(3)
    print("Task 1 finished")

def task_2():
    print("Task 2 started")
    time.sleep(2)
    print("Task 2 finished")

# Создание потоков
thread1 = threading.Thread(target=task_1)
thread2 = threading.Thread(target=task_2)

# Запуск потоков
thread1.start()
thread2.start()

# Ожидание завершения потоков
thread1.join()
thread2.join()

print("Both tasks completed")
