# Ngày 44 · static

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 23 giây

## Bạn học gì

static

## Đáp án câu đố Ngày 43

```java
void main() {
  class Kho { private int vang = 7; }
  var kho = new Kho();
  System.out.println(kho.vang);
}
```

In ra: `7`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 44 · STATIC

Hôm qua ra bảy, vì main cùng tệp.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Ve { static int daBan = 3; }
void main() {
  System.out.println(Ve.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
3
```

Chưa tạo vé nào, số vé vẫn ra ba. Con số đó sống ở đâu?

### BỎ STATIC — Ba vé, ba bộ đếm

Giờ thử bỏ chữ static, tức tĩnh, mỗi vé tự cộng một. Bán ba vé, bạn đoán ra mấy?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Ve {
  int daBan = 0;
  Ve() { daBan++; }
}
void main() {
  new Ve();
  new Ve();
  var veCuoi = new Ve();
  System.out.println(veCuoi.daBan);
}
```

**Đoán trước khi chạy — Bán ba vé, in ra mấy?**

- A. `3`
- B. `1`
- C. `0`

Kết quả (máy đã chạy thật):

```text
1
```

Đáp án đúng: **B**.

Ra một, vì mỗi vé một bộ đếm.

### THÊM MỘT CHỮ — Thêm một chữ

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Ve {
  static int daBan = 0;
  Ve() { daBan++; }
}
void main() {
  new Ve();
  new Ve();
  var veCuoi = new Ve();
  System.out.println(veCuoi.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
3
```

Nhưng thêm lại static, máy ra ba. Ba vé cộng chung một con số.

### Ý chính — STATIC LÀ GÌ — static là đồ của lớp

Đó là vì static thuộc lớp, còn trường thường mỗi vé một bản. Như bảng số thứ tự trên quầy: cả rạp dùng chung một bảng. Chỉ khác: chưa bán vé nào, static vẫn đọc được. Mẹo dân code: gọi bằng tên lớp, nhìn là biết đồ chung.

- **static** — của lớp, chung một bản
- **Trường thường** — mỗi đối tượng một bản
- **Có sẵn** — chưa new vẫn đọc được
- **Ve.daBan** — gọi bằng tên lớp

Ghi nhớ nhanh: static của lớp · trường thường của đối tượng · Ve.daBan gọi tên lớp

### MÃ VÉ RIÊNG — Chung một bảng, mỗi vé một mã

Thế còn mã riêng từng vé? Mỗi vé cộng bảng, rồi chép số đó làm mã. Vé đầu mã một.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class Ve {
  static int daBan = 0;
  int ma;
  Ve() { daBan++; ma = daBan; }
}
void main() {
  int maVe = new Ve().ma;
  maVe = new Ve().ma;
  System.out.println(Ve.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
2
```

Vé sau mã hai, bảng cũng ghi hai.

### LỖI HAY GẶP — Hàm static đòi mã vé

Khoan đã, hàm static in mã vé là hỏng.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Ve {
  static int daBan = 0;
  int ma;
  static void inMa() {
    System.out.println(ma);
  }
}
void main() {
  Ve.inMa();
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: non-static variable ma cannot be
referenced from a static context
```

Java báo static không đụng được trường thường, vì chẳng biết vé nào. Sửa: bỏ static ở hàm, rồi gọi qua một vé.

### LẠM DỤNG STATIC — Vá bằng static?

Thế thêm static vào mã vé?

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
class Ve {
  static int daBan = 0;
  static int ma;
  static void inMa() {
    System.out.println(ma);
  }
}
void main() {
  Ve.inMa();
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Hết lỗi, nhưng cả rạp chung một mã. Dữ liệu riêng từng vé thì đừng static.

## Tóm lại

Tóm lại: static thuộc lớp, nên số ba chẳng cần vé.

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 45.

```java
void main() {
  class Ve { static int dem = 0; }
  new Ve().dem = 5;
  System.out.println(new Ve().dem);
}
```

## Bài tập

Thêm static int tongDoanhThu, cộng dồn mỗi khi tạo vé.
