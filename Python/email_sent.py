import smtplib

def email_send():
    server = smtplib.SMTP('smtp.gmail.com',587)
    server.starttls()
    server.login('terranovaa256@gmail.com','@#(!TeRaNoVa2024)!@#')
    server.sendmail('terranovaa256@gmail.com','gqcsccqwrxuupazkny@poplk.com','testing')
    print("sent")
    server.close()

email_send()
