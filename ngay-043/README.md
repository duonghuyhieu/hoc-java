# Ngày 43 · Đóng gói

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 20 giây

## Bạn học gì

Đóng gói: private, getter, kiểm tra dữ liệu (dựng 2 file)

## Đáp án câu đố Ngày 42

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam + "!");
}
```

In ra: `null!`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 43 · ĐÓNG GÓI

Nối null với chuỗi không sập, in ra null chấm than.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class NhanVat { int mau = 100; }
void main() {
  var nhanVat = new NhanVat();
  nhanVat.mau = -500;
  System.out.println(nhanVat.mau);
}
```

Kết quả (máy đã chạy thật):

```text
-500
```

Một dòng gán thôi, nhân vật game còn âm năm trăm máu. Thêm một chữ private để khóa, Java có chặn nổi dòng này không?

### SỬA NGAY — Thêm một chữ private

Vậy thêm private, tức riêng tư, tưởng chỉ lớp nhân vật đụng được máu. Dòng gán giữ nguyên, bạn đoán lần này ra gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class NhanVat { private int mau = 100; }
void main() {
  var nhanVat = new NhanVat();
  nhanVat.mau = -500;
  System.out.println(nhanVat.mau);
}
```

**Đoán trước khi chạy — Lần này in ra gì?**

- A. `-500`
- B. `100`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
-500
```

Đáp án đúng: **A**.

Vẫn âm năm trăm, Java không báo lỗi nào.

### Ý chính — VÌ SAO LỌT — Cùng file vẫn lọt

Chính chỗ này là bẫy: file gọn ngầm là một lớp lớn, bọc cả main. Mà private chỉ chặn code ngoài lớp đó, nên main lọt. Tách lớp nhân vật sang file riêng, dòng gán máu mới báo lỗi riêng tư.

- **File gọn** — ngầm là một lớp lớn
- **private** — chặn ngoài lớp đó
- **Hai file** — NhanVat.java, Main.java
- **Khác file** — has private access

Ghi nhớ nhanh: NhanVat.java lớp + private · Main.java void main · Khác file bị chặn

### GETTER — Getter chỉ cho xem

Thế đọc máu kiểu gì khi trường đã khóa? Dùng getter, tức hàm lấy giá trị, tên là get cộng tên trường. Bản chép trong main nhận một trăm. Gán nó thành âm năm trăm.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class NhanVat {
  private int mau = 100;
  int getMau() { return mau; }
}
void main() {
  var nhanVat = new NhanVat();
  int banChep = nhanVat.getMau();
  banChep = -500;
  System.out.println(nhanVat.getMau());
}
```

Kết quả (máy đã chạy thật):

```text
100
```

Mà máu thật vẫn một trăm, vì getter chỉ đưa bản chép.

### KIỂM TRA DỮ LIỆU — Quầy kiểm tra

Nhưng trận đấu còn phải hồi máu. Giống quầy thu ngân: khách không mở két, chỉ đưa tiền qua quầy để kiểm tra. Khác ở chỗ quầy do bạn viết, quên dòng if là lọt.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class NhanVat {
  private int mau = 100;
  void hoiMau(int luong) {
    if (luong > 0) mau += luong;
    System.out.println(mau);
  }
}
void main() {
  new NhanVat().hoiMau(-500);
}
```

Kết quả (máy đã chạy thật):

```text
100
```

Gửi vào âm năm trăm, quầy bỏ qua, máu vẫn một trăm. Mẹo dân code: bấm Alt Insert trong IntelliJ là sinh sẵn hàm lấy giá trị.

## Tóm lại

Tóm lại: private, tách file, mọi thay đổi qua quầy kiểm tra. Giờ thì bạn biết vì sao âm năm trăm máu lọt được.

## Câu đố hôm nay

Ra 7 hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 44.

```java
void main() {
  class Kho { private int vang = 7; }
  var kho = new Kho();
  System.out.println(kho.vang);
}
```

## Bài tập

Thêm hàm truMau(int) không cho máu tụt dưới 0.
