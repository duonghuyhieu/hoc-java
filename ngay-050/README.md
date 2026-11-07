# Ngày 50 · instanceof có pattern

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 23 giây

## Bạn học gì

instanceof có pattern

## Đáp án câu đố Ngày 49

```java
void main() {
  Object kiem = "Kiếm rồng";
  System.out.println(kiem.toString());
}
```

In ra: `Kiếm rồng`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 50 · INSTANCEOF CÓ PATTERN

Câu đố hôm qua ra Kiếm rồng, nhờ chuỗi ghi đè.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  Object tin = 99;
  String chu = (String) tin;
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ClassCastException: class
java.lang.Integer cannot be cast to class
java.lang.String (java.lang.Integer and
java.lang.String are in module java.base
of loader 'bootstrap') (dòng 3)
```

Còn đây, ép lượt thích thành chuỗi: Java cho qua, chạy lên thì sập. Một từ khóa cứu được dòng này, từ nào?

### SỬA MỘT DÒNG — Hỏi kiểu trước

Hóa ra là instanceof, tức hỏi có phải kiểu này không. Vẫn số đó, lần này máy in gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  Object tin = 99;
  if (tin instanceof String chu) {
    System.out.println(chu.length());
  }
  System.out.println("Không sập");
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `2`
- B. `Không sập`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
Không sập
```

Đáp án đúng: **B**.

Ra chữ không sập, vì số đâu phải chuỗi nên bỏ qua nhánh.

### Ý chính — KHÁI NIỆM — Hỏi kiểu cầm luôn

Vậy chữ chu đứng sau kiểu để làm gì? Đó là pattern, tức mẫu: đúng kiểu thì giá trị vào biến mới luôn, khỏi ép tay. Giống shipper hỏi gói dễ vỡ không, đúng thì cầm kiểu dễ vỡ luôn. Có điều shipper còn liều được, Java thì không. Biến chỉ sống nơi chắc chắn đúng kiểu, còn giá trị rỗng null luôn ra sai.

- **instanceof** — hỏi có đúng kiểu không
- **String chu** — đúng kiểu thì gán luôn
- **Phạm vi** — nơi chắc chắn đúng kiểu
- **null** — luôn ra false

Ghi nhớ nhanh: Cách cũ kiểm rồi ép · Pattern gộp một bước · Sai kiểu không sập

### CỘNG LƯỢT THÍCH — Chữ bỏ qua số cộng dồn

Giờ thử hộp thư lẫn chữ với số, chỉ cộng lượt thích. Vòng một gặp chuỗi, hỏi ra sai nên tổng vẫn không. Vòng hai gặp số năm, tổng lên năm.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  Object[] hopThu = {"Hay!", 5, 7};
  int tong = 0;
  for (Object tin : hopThu) {
    if (tin instanceof Integer luot) {
      tong = tong + luot;
    }
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
12
```

Vòng ba thêm bảy, tổng mười hai, chẳng ép tay dòng nào.

### LỌC GỌN — Dùng ngay trong điều kiện

Thế còn lọc tin dài thì sao?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  Object tin = "Lan thích ảnh";
  if (tin instanceof String chu
      && chu.length() > 5) {
    System.out.println("Tin dài");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Tin dài
```

Biến chu dùng ngay ở vế sau phép và. Mẹo dân code: gộp thế này, khỏi lồng hai tầng if.

### LỖI HAY GẶP — Đổi một phép là hết chạy

Khoan đã, đổi sang phép hoặc là Java từ chối. Vì vế đầu sai mới chạy vế sau, lúc đó chưa có biến chu.

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  Object tin = "Lan thích ảnh";
  if (tin instanceof String chu
      || chu.length() > 5) {
    System.out.println("Tin dài");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

Java báo không tìm thấy tên, trả lại phép và là xong.

## Tóm lại

Tóm lại: giờ bạn biết vì sao ép tay sập, pattern thì không.

## Câu đố hôm nay

In true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 51.

```java
void main() {
  Object tin = null;
  boolean laTin = tin instanceof Object;
  System.out.println(laTin);
}
```

## Bài tập

Nếu tin là Integer thì in gấp đôi số đó.
