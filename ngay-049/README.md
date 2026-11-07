# Ngày 49 · Đa hình

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 16 giây

## Bạn học gì

Đa hình

## Đáp án câu đố Ngày 48

```java
void main() {
  String ma = new String("VIP");
  String khac = new String("VIP");
  System.out.println(ma.equals(khac));
}
```

In ra: `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 49 · ĐA HÌNH

Đáp án hôm qua: true, vì cùng nội dung.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Rong dich = new Rong();
  System.out.println(dich.dame());
}
```

Kết quả (máy đã chạy thật):

```text
50
```

Rồng đánh năm mươi sát thương, đúng như code. Nhưng đổi một chữ đầu dòng, rồng có tụt về mười không?

### ĐỔI MỘT CHỮ — Cùng con rồng khác kiểu biến

Vậy đổi thành biến kiểu cha, đối tượng vẫn là rồng. Máy in mười hay năm mươi?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.dame());
}
```

**Đoán trước khi chạy — Máy in ra số mấy?**

- A. `10`
- B. `50`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
50
```

Đáp án đúng: **B**.

Vẫn năm mươi: rồng cũng là quái, nên biến kiểu cha trỏ được. Đừng tưởng biến kiểu cha thì luôn chạy hàm cha.

### Ý chính — ĐA HÌNH LÀ GÌ — Một lệnh gọi nhiều cách chạy

Chính đối tượng thật quyết định: lúc chạy, Java tìm hàm theo nó. Đó gọi là đa hình: một lệnh, mỗi lớp một cách. Như gọi xe trên app: xe máy hay ô tô tự tính giá theo loại. Có điều app bắt bạn chọn, còn Java tự biết.

- **Biến kiểu cha** — trỏ được vào đối tượng con
- **Đối tượng thật** — quyết định hàm nào chạy
- **Đa hình** — một lệnh, mỗi lớp một cách

Ghi nhớ nhanh: Kiểu cha trỏ kiểu con · Lúc chạy mới chọn hàm · Một lệnh nhiều cách

### CẢ ĐÀN QUÁI — Một vòng lặp đủ mọi loại quái

Thế nên cả đàn quái vào chung một mảng kiểu cha. Vòng một gặp quái thường, sát thương là mười.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; } }
void main() {
  Quai[] dan = {new Quai(), new Rong()};
  for (Quai con : dan) {
    int sat = con.dame();
    System.out.println(sat);
  }
}
```

Kết quả (máy đã chạy thật):

```text
10
50
```

Vòng hai vẫn dòng ấy, gặp rồng nên sát thương nhảy lên năm mươi. Thêm loại quái mới, vòng lặp khỏi sửa.

### LỖI HAY GẶP — Biến kiểu cha không gọi được

Nhưng hàm phun lửa riêng của rồng, gọi qua biến quái là hỏng.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
  int phunLua() { return 90; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.phunLua());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 8: cannot find symbol
```

Java báo không tìm thấy hàm, vì biên dịch chỉ nhìn kiểu biến. Khai biến kiểu rồng là xong, giữ kiểu quái thì ngày mai học kỹ. Mẹo: dòng location, tức vị trí, chỉ đúng kiểu Java đang tìm.

## Tóm lại

Tóm lại: rồng vẫn đánh năm mươi vì đối tượng quyết định hàm chạy.

## Câu đố hôm nay

Bạn cược in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 50.

```java
void main() {
  Object kiem = "Kiếm rồng";
  System.out.println(kiem.toString());
}
```

## Bài tập

Thêm lớp QuaiBang sát thương 40 vào mảng.
