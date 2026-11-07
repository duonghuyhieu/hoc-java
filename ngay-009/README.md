# Ngày 9 · Nhập từ bàn phím (IO.readln)

> Java 100 ngày · 2. Ra quyết định · video 1 phút 6 giây

## Bạn học gì

Nhập từ bàn phím (IO.readln)

## Đáp án câu đố Ngày 8

```java
void main() {
  String ten = "mai";
  ten.toUpperCase();
  System.out.println(ten.charAt(2));
}
```

In ra: `i`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 9 · NHẬP TỪ BÀN PHÍM

Đáp án hôm qua: chữ i.

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

Khách gõ năm mươi, cộng hai mươi, ra năm không hai không. Bàn phím làm gì con số này?

### ĐỌC BÀN PHÍM — Để khách tự gõ

Vậy thay số sẵn bằng readln, lệnh đọc bàn phím. Nó in câu hỏi, rồi dừng chờ khách nhấn Enter.

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

Mẹo: chừa dấu cách cuối câu hỏi, chữ gõ khỏi dính.

### Ý chính — READLN LÀM GÌ — Hỏi, chờ, trả về chuỗi

Hóa ra nó như nhân viên order: hỏi anh dùng gì rồi đứng chờ. Nhưng nhân viên hiểu năm mươi là số, readln thì không. Gõ gì cũng ra chuỗi String, nên dấu cộng chỉ dán.

- **IO.readln** — in câu hỏi, đọc một dòng
- **Enter** — gõ xong mới chạy tiếp
- **String** — gõ gì cũng ra chuỗi
- **Biến chuỗi** — hứng kết quả để dùng tiếp

Ghi nhớ nhanh: IO.readln hỏi và đọc · Chờ tới Enter · Luôn trả String

### THÊM PHÍ — Cộng dồn trên chuỗi

Thế thêm phí năm nữa, in ra sao?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String cuocXe = "50";
  cuocXe = cuocXe + 20;
  cuocXe = cuocXe + 5;
  System.out.println(cuocXe);
}
```

**Đoán trước khi chạy — Thêm phí 5 nữa, in ra gì?**

- A. `75`
- B. `50205`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
50205
```

Đáp án đúng: **B**.

Phụ phí xong là năm không hai không. Thêm năm, nó dài ra: năm không hai không năm.

### LỖI HAY GẶP — Gõ 50k rồi đem cộng

Nhưng khách gõ năm mươi k rồi gán vào số nguyên int?

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

Java từ chối: chuỗi không nhét được vào đó. Bỏ chữ k, đổi sang số: ngày sáu mươi hai học kỹ.

## Tóm lại

Tóm lại: giờ bạn biết cước sai vì bàn phím trả chuỗi.

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
