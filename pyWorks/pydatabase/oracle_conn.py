import oracledb

conn = oracledb.connect(user='C##mydb2', password='mydb',
                        dsn='localhost:1521/xe')
cursor = conn.cursor()

'''
def getconn():
    # dsn - data source name
    conn = oracledb.connect(user='C##mydb2', password='mydb',
                            dsn='localhost:1521/xe')
    return conn
'''

def select():
    sql = "SELECT * FROM pytest"
    cursor.execute(sql)
    rs = cursor.fetchall()

    print(rs)

    conn.close()

select()

def insert():
    sql = "INSERT INTO pytest VALUES ('행운을 빌어요')"
    cursor.execute(sql)
    conn.commit()
    conn.close()

# insert()