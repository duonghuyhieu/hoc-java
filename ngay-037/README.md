# Ngày 37 · Class & object (2/2)

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 21 giây

## Bạn học gì

Class & object (2/2): nhiều đối tượng + «bộ mặt đầy đủ» public class/public static void main(String[] args)

## Đáp án câu đố Ngày 36

```java
void main() {
  class Meo { int tuoi = 1; }
  new Meo().tuoi = 9;
  System.out.println(new Meo().tuoi);
}
```

In ra: `1`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 37 · CLASS & OBJECT

Hôm qua in ra một, vì mỗi new là bé mới.

File `Loi1.java` — chạy: `java Loi1.java`

```java
public class Main {
  void main() { }
  System.out.println("Máu: 100");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: <identifier> expected
```

Còn đây, lệnh in máu nhân vật nằm trong class mà Java từ chối. Nó đứng sai đúng một chỗ, bạn nhìn ra chưa?

### ĐƯA VÀO MAIN — Cửa vào của chương trình

Chính chỗ này: thân class chỉ khai báo, lệnh chạy phải nằm trong main.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
public class Main {
  public static void main(
      String[] args) {
    System.out.println("Máu: 100");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 100
```

Đưa lệnh vào trong, viết main đủ bộ mặt, máy in ngay máu một trăm. Mẹo dân code: trong IntelliJ gõ p s v m rồi Tab là ra cả dòng.

### Ý chính — BỘ MẶT ĐẦY ĐỦ — Bộ mặt đầy đủ

Quay lại dòng dài ấy: public nghĩa là máy ở ngoài gọi được. Còn static cho chạy khi chưa có đối tượng nào. Chữ void báo không trả gì về. Cuối cùng, args giữ chữ truyền vào lúc bật chương trình. Riêng public class thì tên file phải trùng tên class.

- **public** — máy ở ngoài gọi được
- **static** — chạy khi chưa có đối tượng
- **void** — không trả gì về
- **String[] args** — chữ truyền vào lúc chạy

Ghi nhớ nhanh: public class trùng tên file · psvm + Tab tự sinh main · void main() bản viết gọn

### NHIỀU ĐỐI TƯỢNG — Một khuôn hai nhân vật

Viết gọn dòng đó chính là void main mấy hôm nay, nên mình dùng lại. Hai lần new ra hiệp sĩ và rồng, mỗi đứa một nhãn riêng. Trừ máu hiệp sĩ còn bảy mươi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  NhanVat hiepSi = new NhanVat();
  NhanVat rong = new NhanVat();
  hiepSi.mau = 70;
  int mauRong = rong.mau;
  System.out.println(mauRong);
}
class NhanVat {
  int mau = 100;
}
```

Kết quả (máy đã chạy thật):

```text
100
```

Lấy máu rồng ra in, vẫn một trăm. Mỗi đối tượng giữ ô máu riêng, đụng đứa này đứa kia không đổi.

### ĐỔI MỘT CHỖ — Bỏ new thì sao?

Nhưng bỏ new đi, cho rồng trỏ thẳng vào hiệp sĩ. Trừ máu như cũ, rồng còn bao nhiêu?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  NhanVat hiepSi = new NhanVat();
  NhanVat rong = hiepSi;
  hiepSi.mau = 70;
  int mauRong = rong.mau;
  System.out.println(mauRong);
}
class NhanVat {
  int mau = 100;
}
```

**Đoán trước khi chạy — Rồng còn bao nhiêu máu?**

- A. `100`
- B. `70`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
70
```

Đáp án đúng: **B**.

Bảy mươi, vì hai biến cùng nhãn một, tức cùng một đối tượng. Phép gán chỉ chép địa chỉ, new mới sinh nhân vật.

## Tóm lại

Tóm lại: lệnh in kia đứng ngoài main, còn mỗi new một đối tượng.

## Câu đố hôm nay

true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 38.

```java
void main() {
  class Rong { int mau = 100; }
  Rong lua = new Rong();
  System.out.println(lua == new Rong());
}
```

## Bài tập

Viết bản đủ public class, tạo hai nhân vật khác máu rồi in.
