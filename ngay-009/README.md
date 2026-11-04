# Ngày 9 · Nhập từ bàn phím (IO.readln)

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

Nhập từ bàn phím (IO.readln)

## Code trong video

### NGÀY 9 · NHẬP TỪ BÀN PHÍM

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String cuocXe = "50";
  System.out.println(cuocXe + 20);
}
```

Kết quả (máy đã chạy thật):

```text
5020
```

### ĐỌC BÀN PHÍM — Để khách tự gõ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String cuocXe = IO.readln("Cước: ");
  System.out.println(cuocXe + 20);
}
```

Kết quả (máy đã chạy thật):

```text
Cước: null20
```

### THÊM PHÍ — Cộng dồn trên chuỗi

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String cuocXe = "50";
  cuocXe = cuocXe + 20;
  cuocXe = cuocXe + 5;
  System.out.println(cuocXe);
}
```

Kết quả (máy đã chạy thật):

```text
50205
```

### LỖI HAY GẶP — Gõ 50k rồi đem cộng

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String cuocXe = "50k";
  int tong = cuocXe + 20;
  System.out.println(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: String cannot
be converted to int
```

## Đáp án câu đố Ngày 8

```java
void main() {
  String ten = "mai";
  ten.toUpperCase();
  System.out.println(ten.charAt(2));
}
```

In ra: `i`

## Câu đố hôm nay

Dấu cộng nào tính, nào dán? Đoán trước, rồi chạy thử. Đáp án ở Ngày 10.

```java
void main() {
  String soGhe = "4";
  System.out.println(1 + 1 + soGhe);
}
```

## Bài tập

Hỏi tên và điểm đến, in «An đi Bến Thành».
