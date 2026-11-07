# Ngày 38 · Constructor & this

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 20 giây

## Bạn học gì

Constructor & this

## Đáp án câu đố Ngày 37

```java
void main() {
  class Rong { int mau = 100; }
  Rong lua = new Rong();
  System.out.println(lua == new Rong());
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 38 · CONSTRUCTOR & THIS

Câu đố rồng ra false: hai con khác nhau dù giống hệt. Đoạn này tạo phim Mai, code chạy êm, lệnh in hiện chữ gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Phim {
  String ten;
  Phim(String ten) { ten = ten; }
}
void main() {
  var phim = new Phim("Mai");
  System.out.println(phim.ten);
}
```

**Đoán trước khi chạy — Lệnh in hiện chữ gì?**

- A. `Mai`
- B. `null`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
null
```

Đáp án đúng: **B**.

Ra null, vậy tên phim biến đâu mất?

### THÊM MỘT CHỮ — Thêm this là có tên

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var phim = new Phim("Mai");
  System.out.println(phim.ten);
}
```

Kết quả (máy đã chạy thật):

```text
Mai
```

Giờ thử thêm đúng một chữ this, tên Mai quay về. Đó là vì tham số che mất trường cùng tên, nên dòng cũ tự gán cho chính nó. Trường chưa ai đụng tới nên chuỗi giữ null, số giữ không.

### Ý chính — CONSTRUCTOR — Hàm tạo chạy khi new

Chính chỗ đó là constructor, tức hàm tạo, chạy đúng một lần lúc đối tượng ra đời. Nó phải trùng tên class, và không ghi kiểu trả về. Giống đặt bánh theo đơn: làm là điền nhân ngay, còn this là của chính cái bánh này. Ẩn dụ gãy ở chỗ bánh xong khó đổi nhân, còn trường gán lại được.

- **Chạy khi new** — đúng một lần
- **Trùng tên** — tên y hệt class
- **Không kiểu về** — không ghi cả void
- **this** — đối tượng đang tạo

Ghi nhớ nhanh: Phim(...) trùng class · new gọi hàm tạo · this đối tượng này

### HAI ĐƠN — Mỗi new một đối tượng

Thế còn hai đơn liền nhau: mỗi new ra một đối tượng riêng. Biến đang xem lúc này cùng nhãn một với phim Mai. Gọi hàm tạo lần nữa, this giờ là đối tượng nhãn hai.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var mai = new Phim("Mai");
  var dangXem = mai;
  dangXem = new Phim("Đào");
  System.out.println(dangXem.ten);
}
```

Kết quả (máy đã chạy thật):

```text
Đào
```

Nên lệnh in ra Đào, còn Mai vẫn nguyên.

### LỖI HAY GẶP — Đơn thiếu tên phim

Nhưng tạo phim mà không đưa tên là sai, vì đơn thiếu nhân.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var phim = new Phim();
  System.out.println(phim.ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 6: constructor Phim in class Phim
cannot be applied to given types;
```

Java báo hàm tạo không khớp, vì tự viết là mất bản rỗng mặc định. Sửa bằng cách truyền tên vào, hoặc viết thêm hàm tạo rỗng. Mẹo dân code: IntelliJ bấm Alt Insert là sinh sẵn hàm tạo đủ dòng gán.

## Tóm lại

Tóm lại: thiếu this thì tham số tự gán cho chính nó. Giờ thì bạn biết vì sao tên Mai biến mất.

## Câu đố hôm nay

In ra số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 39.

```java
void main() {
  class Phim { int sao = 3;
    Phim(int sao) { sao = 5; } }
  System.out.println(new Phim(9).sao);
}
```

## Bài tập

Thêm trường daXem (boolean) vào constructor của Phim.
