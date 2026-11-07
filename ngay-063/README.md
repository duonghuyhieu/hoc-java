# Ngày 63 · Exception (2/3)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 17 giây

## Bạn học gì

Exception (2/3): finally

## Đáp án câu đố Ngày 62

```java
void main() {
  try { Integer.parseInt("+5"); }
  catch (Exception e) { return; }
  System.out.println("Hợp lệ");
}
```

In ra: `Hợp lệ`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 63 · FINALLY

Hôm qua in Hợp lệ: dấu cộng vẫn đổi được. Quầy vé giữ ghế A năm, phép chia hỏng, khối bắt lỗi thoát bằng return.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  try {
    System.out.println("Giữ ghế A5");
    int moiNguoi = 270 / 0;
  } catch (ArithmeticException e) {
    return;
  }
  System.out.println("Nhả ghế A5");
}
```

Kết quả (máy đã chạy thật):

```text
Giữ ghế A5
```

Chỉ in Giữ ghế, ghế bị giam mãi — từ khóa nào cứu nó?

### SỬA MỘT CHỖ — Dời vào finally

Chính finally, nghĩa là cuối cùng: dời lệnh nhả ghế vào đó. Vẫn thoát giữa chừng — lần này in mấy dòng?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  try {
    System.out.println("Giữ ghế A5");
    int moiNguoi = 270 / 0;
  } catch (ArithmeticException e) {
    return;
  } finally {
    System.out.println("Nhả ghế A5");
  }
}
```

**Đoán trước khi chạy — Bạn đoán in mấy dòng?**

- A. `Giữ ghế A5`
- B. `Giữ ghế A5 / Nhả ghế A5`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Giữ ghế A5
Nhả ghế A5
```

Đáp án đúng: **B**.

Hai dòng: finally chen vào trước khi hàm thoát.

### Ý chính — FINALLY LUÔN CHẠY — Ngả nào cũng chạy

Hóa ra finally chạy ở mọi ngả: êm, có lỗi, hay đang trả về. Như thu ngân, giao dịch lỗi hay không, cuối ca vẫn khóa két. Chỉ khác: két khóa một lần mỗi ca, finally chạy sau mỗi lần thử. Thứ tự: thử, bắt lỗi nếu có, rồi finally; bỏ bắt lỗi cũng được.

- **Chạy êm** — finally vẫn chạy
- **Có lỗi** — catch xong tới finally
- **Có return** — finally chạy trước khi thoát
- **Không catch** — try đi với finally vẫn được

Ghi nhớ nhanh: finally luôn chạy · sau cùng sau try, catch · dọn dẹp nhả ghế, khóa két

### TRY + FINALLY — Không cần catch

Vậy bỏ khối bắt lỗi, quầy còn năm mươi ghế trống.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int gheTrong = 50;
  try {
    gheTrong = gheTrong - 2;
    System.out.println("Đã đặt 2 vé");
  } finally {
    System.out.println("Khóa quầy");
  }
  System.out.println(gheTrong);
}
```

Kết quả (máy đã chạy thật):

```text
Đã đặt 2 vé
Khóa quầy
48
```

Đặt hai vé, còn bốn mươi tám ghế, rồi finally in Khóa quầy. Mẹo dân code: IntelliJ bôi đen rồi bấm Control Alt T là bọc sẵn.

### LỖI HAY GẶP — Dọn dẹp ngoài finally

Nhưng phép tính hỏng mà không ai bắt thì sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int gheTrong = 50;
  try {
    gheTrong = gheTrong / 0;
    System.out.println("Đã đặt 2 vé");
  } finally {
    System.out.println("Khóa quầy");
  }
  System.out.println(gheTrong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Khóa quầy
ArithmeticException: / by zero (dòng 4)
```

Java vẫn in Khóa quầy, rồi mới văng lỗi chia cho không. Dòng in số ghế ngoài khối bị bỏ — dọn dẹp phải vào finally.

## Tóm lại

Tóm lại: dọn dẹp đặt trong finally, lỗi hay thoát đều chạy. Giờ bạn biết vì sao ghế A năm bị giam: lệnh nhả đứng ngoài.

## Câu đố hôm nay

In ra năm hay sáu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 64.

```java
void main() {
  int soVe = 2;
  try { soVe += 3; } finally { soVe++; }
  System.out.println(soVe);
}
```

## Bài tập

Muốn tự ném lỗi khi khách đặt quá số ghế thì viết thế nào?
