# Ngày 14 · switch kiểu mới (->)

> Java 100 ngày · 2. Ra quyết định · video 1 phút 5 giây

## Bạn học gì

switch kiểu mới (->)

## Đáp án câu đố Ngày 13

```java
void main() {
  boolean coVe = true;
  boolean duTuoi = false;
  System.out.println(!(coVe && duTuoi));
}
```

In ra: `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 14 · SWITCH KIỂU MỚI

Câu đố trước in true. Thứ hai chỉ tập vai, lịch này in gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int thu = 2;
  switch (thu) {
    case 2: System.out.println("Vai");
    case 3: System.out.println("Tay");
  }
}
```

**Đoán trước khi chạy — Thứ hai, app in ra gì?**

- A. `Vai`
- B. `Tay`
- C. `Vai / Tay`

Kết quả (máy đã chạy thật):

```text
Vai
Tay
```

Đáp án đúng: **C**.

In cả vai lẫn tay, vì sao?

### KIỂU MỚI — Đổi sang mũi tên

Hóa ra kiểu cũ vào đúng nhánh rồi lọt xuống. Đổi sang mũi tên, mỗi nhánh chạy xong là dừng.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int thu = 2;
  switch (thu) {
    case 2 -> System.out.println("Vai");
    case 3 -> System.out.println("Tay");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Vai
```

Giờ in đúng vai.

### Ý chính — SWITCH LÀ GÌ — Tra đúng ô, không lọt

Vậy switch như bảng giá theo ngày: tra đúng ô, không lọt ô bên cạnh. Nhưng nó chỉ tra đúng y, không so lớn nhỏ. Mỗi ô là một case. Không khớp thì vào default, ô mặc định.

- **switch** — tra đúng y một giá trị
- **case ->** — một ô, không lọt
- **default** — không khớp ô nào

Ghi nhớ nhanh: switch tra bảng · case -> đúng một ô · default ô mặc định

### SWITCH TRẢ GIÁ TRỊ — Gộp ô, trả giá trị

Giờ thử gán thẳng kết quả switch vào buổi tập. Bảy với tám gộp một ô. Thiếu default, Java từ chối vì số nào cũng cần kết quả.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int thu = 7;
  String buoiTap = switch (thu) {
    case 2 -> "Vai";
    case 7, 8 -> "Chạy bộ";
    default -> "Nghỉ";
  };
  System.out.println(buoiTap);
}
```

Kết quả (máy đã chạy thật):

```text
Chạy bộ
```

Số bảy ra chạy bộ.

### CODE CŨ VẪN GẶP — Quên break là lọt

Nhưng code cũ còn đầy, soi ô biến. Thứ hai, buổi tập thành vai.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int thu = 2;
  String buoiTap = "Nghỉ";
  switch (thu) {
    case 2: buoiTap = "Vai";
    case 3: buoiTap = "Tay";
  }
  System.out.println(buoiTap);
}
```

Kết quả (máy đã chạy thật):

```text
Tay
```

Rồi lọt xuống, ghi đè thành tay. Muốn dừng, kiểu cũ phải thêm lệnh thoát break. Mẹo dân code: IntelliJ bấm Alt Enter tự đổi mũi tên.

## Tóm lại

Tóm lại: kiểu cũ lọt xuống tay, mũi tên dừng ở vai.

## Câu đố hôm nay

Calo in ra bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 15.

```java
void main() {
  int calo = 300 + switch (8) {
    case 7, 8 -> 200; default -> 0; };
  System.out.println(calo);
}
```

## Bài tập

Đổi size S, M, L thành giá trà sữa bằng switch.
