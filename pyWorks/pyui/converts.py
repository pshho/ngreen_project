from tkinter import *

def converter():
    tc = eval(ec.get())
    tf.delete(0.0, END)
    tff = f'{tc * 1.8 + 32:.2f}'
    tf.insert(0.0, tff)

root = Tk()
root.title('온도 변환기')
root.geometry('500x400')
frame = Frame(root)
frame.pack()

Label(frame, text='deg C').grid(row=0, column=0)
ec = Entry(frame, text='')
ec.grid(row=0, column=1)

Label(frame, text='deg F').grid(row=1, column=0)
tf = Text(frame, width=20, height=1.2)
tf.grid(row=1, column=1)

Button(frame, text='변환', command=converter).grid(row=2, columnspan=2)

root.mainloop()