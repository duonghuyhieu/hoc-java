# Ngày 64 · Exception (3/3)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

Exception (3/3): checked, throws, tự tạo

## Code trong video

### NGÀY 64 · CHECKED, THROWS, TỰ TẠO

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int xu = 100;
  xu = xu - 30;
  throw new Exception("Hết xu");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: unreported exception Exception;
must be caught or declared to be thrown
```

### ĐỔI MỘT CHỮ — Đổi một chữ Java cho qua

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  int xu = 100;
  xu = xu - 30;
  throw new RuntimeException("Hết xu");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
RuntimeException: Hết xu (dòng 4)
```

### TỰ TẠO LỖI — Lỗi hết xu do bạn tạo

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class HetXu extends Exception {}
void mua(int gia) throws HetXu {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  try { mua(30); mua(150); mua(10); }
  catch (HetXu e) {
    System.out.println("Hết xu"); }
}
```

Kết quả (máy đã chạy thật):

```text
Mua 30
Hết xu
```

### LỖI HAY GẶP — Quên throws ở đầu hàm

File `Loi3.java` — chạy: `java Loi3.java`

```java
class HetXu extends Exception {}
void mua(int gia) {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  mua(150);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: unreported exception HetXu; must
be caught or declared to be thrown
```

## Đáp án câu đố Ngày 63

```java
void main() {
  int soVe = 2;
  try { soVe += 3; } finally { soVe++; }
  System.out.println(soVe);
}
```

In ra: `6`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 65.

```java
void main() {
  int xu = 0; try { xu = 9 / xu; }
  catch (Exception e) { xu = 5; }
  System.out.println(xu);
}
```

## Bài tập

Tạo MaGiamGiaHetHan extends Exception, ném rồi bắt nó.
