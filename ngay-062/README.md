# Ngày 62 · Exception (1/3)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

Exception (1/3): try/catch

## Code trong video

### NGÀY 62 · TRY/CATCH — Gõ 50k là ví sập?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String nhap = "50k";
  int tien = Integer.parseInt(nhap);
  System.out.println("Nạp " + tien);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NumberFormatException: For input string:
"50k" (dòng 3)
```

### CỨU VÍ — Bọc trong try catch

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String nhap = "50k";
  try {
    int tien = Integer.parseInt(nhap);
    System.out.println("Nạp " + tien);
  } catch (NumberFormatException e) {
    System.out.println("Chỉ nhập số!");
  }
  System.out.println("Ví vẫn mở");
}
```

Kết quả (máy đã chạy thật):

```text
Chỉ nhập số!
Ví vẫn mở
```

### NHẢY CÓC — Nạp ba lần lỗi ở giữa

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("200");
    soDu += Integer.parseInt("5k");
    soDu += Integer.parseInt("300");
  } catch (NumberFormatException e) {
    System.out.println(soDu);
  }
}
```

Kết quả (máy đã chạy thật):

```text
200
```

### LỖI HAY GẶP — Catch trống nuốt lỗi

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (Exception e) {}
  System.out.println("Số dư: " + soDu);
}
```

Kết quả (máy đã chạy thật):

```text
Số dư: 0
```

### SỬA LẠI — In lời nhắn của lỗi

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (NumberFormatException e) {
    System.out.println(e.getMessage());
  }
  System.out.println("Số dư: " + soDu);
}
```

Kết quả (máy đã chạy thật):

```text
For input string: "5k"
Số dư: 0
```

## Đáp án câu đố Ngày 61

```java
void main() {
  var maHang = Arrays.asList("9", "10");
  Collections.sort(maHang);
  System.out.println(maHang);
}
```

In ra: `[10, 9]`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 63.

```java
void main() {
  try { Integer.parseInt("+5"); }
  catch (Exception e) { return; }
  System.out.println("Hợp lệ");
}
```

## Bài tập

Chia hoá đơn cho 0 người: catch lỗi số có đỡ được không?
