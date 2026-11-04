# Ngày 53 · interface (2/2)

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

interface (2/2): quên public, nhiều interface, default method

## Code trong video

### NGÀY 53 · INTERFACE (PHẦN 2) — Một máy hai hợp đồng

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface Goi { String goi(); }
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String goi() { return "Alo"; }
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().chup());
}
```

Kết quả (máy đã chạy thật):

```text
Ảnh
```

### CÙNG MỘT LỚP — Một lớp máy làm hai việc

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface Goi { String goi(); }
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String goi() { return "Alo"; }
  public String chup() { return "Ảnh"; }
}
void main() {
  String viec = new May().goi();
  viec = new May().chup();
}
```

Đoạn này không in ra gì — trên video, ô BIẾN cho thấy giá trị đổi qua từng dòng.

### DEFAULT — Hợp đồng viết sẵn ruột

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
```

Kết quả (máy đã chạy thật):

```text
Alo
```

### LỖI HAY GẶP — Quên public

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 6: chup() in May cannot implement
chup() in Chup
```

## Đáp án câu đố Ngày 52

```java
void main() {
  CharSequence diaChi = "Quận 1";
  System.out.println(diaChi.length());
}
```

In ra: `6`

## Câu đố hôm nay

Chạy được không, in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 54.

```java
void main() {
  CharSequence matKhau = "";
  System.out.println(matKhau.isEmpty());
}
```

## Bài tập

Thêm lớp Drone implements Chup, chụp ra «Ảnh trên cao».
