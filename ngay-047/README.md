# Ngày 47 · Kế thừa (1/2)

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 26 giây

## Bạn học gì

Kế thừa (1/2): extends

## Đáp án câu đố Ngày 46

```java
void main() {
  int[] viGoc = {50000};
  int[] viPhu = {50000};
  System.out.println(viGoc == viPhu);
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 47 · KẾ THỪA

Đố hôm qua ra false: hai mảng, hai đối tượng. Lớp VIP này ruột rỗng.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  System.out.println(new Vip().chao());
}
```

Kết quả (máy đã chạy thật):

```text
Chào
```

Thế mà vẫn chào được, chữ Chào từ đâu?

### BỎ MỘT CỤM — Bỏ extends

Khoan đã, xóa cụm extends, nghĩa là kế thừa. Bạn đoán máy in gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip { }
void main() {
  System.out.println(new Vip().chao());
}
```

**Đoán trước khi chạy — Bỏ extends, máy in gì?**

- A. `Chào`
- B. `null`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: cannot find symbol
```

Đáp án đúng: **C**.

Lỗi biên dịch, lớp VIP hết hàm chào. Vậy chữ Chào thừa hưởng từ tài xế.

### Ý chính — KẾ THỪA — VIP vẫn là tài xế

Hóa ra VIP vẫn là tài xế, chỉ thêm câu mời nước. Lớp cha giữ phần chung, lớp con nhận hết trừ private. Mỗi lớp chỉ extends được một cha. Nhưng người bỏ được thói quen, lớp con không xóa nổi hàm cha.

- **extends** — nối lớp con vào lớp cha
- **Lớp cha** — giữ phần chung
- **Lớp con** — nhận hết, trừ private
- **Một cha** — mỗi lớp extends một lớp

Ghi nhớ nhanh: extends kế thừa · Lớp cha phần chung · Lớp con thêm riêng

### NỐI TAY — Thêm lời mời bằng tay

Giờ thử thêm lời mời bằng tay. Lời chào đang là Chào.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  Vip taiXe = new Vip();
  String loiChao = taiXe.chao();
  loiChao = loiChao + ", mời nước";
  System.out.println(loiChao);
}
```

Kết quả (máy đã chạy thật):

```text
Chào, mời nước
```

Nối thêm, nó thành Chào, mời nước. Nhưng mười chỗ gọi là nối mười lần.

### GHI ĐÈ — Ghi đè, giữ lời cha

Vậy ghi đè, tức viết lại hàm chào ở lớp con. Gọi super, tức lớp cha, lấy Chào rồi nối lời mời.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

Kết quả (máy đã chạy thật):

```text
Chào, mời nước
```

Giờ gọi đâu cũng đủ câu.

### GÕ NHẦM MỘT CHỮ — C hoa hay c thường

Nhưng gõ C hoa, bỏ nhãn ghi đè thì sao? Bạn cược máy in gì?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  String Chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

**Đoán trước khi chạy — Sai một chữ, máy in gì?**

- A. `Chào, mời nước`
- B. `Chào`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Chào
```

Đáp án đúng: **B**.

Chỉ còn Chào, không lỗi, vì đó là hàm mới.

### LỖI HAY GẶP — @Override bắt lỗi gõ sai

Chính chỗ này phải gắn nhãn Override.

File `Loi2.java` — chạy: `java Loi2.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String Chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: method does not override or
implement a method from a supertype
```

Java báo: hàm này không ghi đè gì. Đổi về c thường là hết. Mẹo: trong IntelliJ, Control O sinh sẵn hàm ghi đè.

## Tóm lại

Tóm lại: lớp rỗng vẫn chào vì extends mang hàm cha xuống.

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 48.

```java
void main() {
  class Xe { int gia() { return 9; } }
  class Vip extends Xe { }
  System.out.println(new Vip().gia());
}
```

## Bài tập

Lớp cha có hàm tạo nhận tên, lớp VIP gọi thế nào?
