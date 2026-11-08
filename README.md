# Java 100 ngày — code dự án theo video

[![Kiểm code theo video](https://github.com/duonghuyhieu/hoc-java/actions/workflows/kiem.yml/badge.svg)](https://github.com/duonghuyhieu/hoc-java/actions/workflows/kiem.yml) [![Mở bằng Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/duonghuyhieu/hoc-java)

Code các bài dự án và bài mini trong series «Java 100 ngày» trên kênh **Hiếu học mỗi ngày** — những bài code dài, khó gõ lại theo video. Bài thường ngắn, gõ theo video là đủ nên không có ở đây. Mỗi bài một thư mục: README ghi bạn học gì, từng đoạn code trên video kèm lệnh chạy và kết quả máy đã chạy thật, câu đố và bài tập. Mỗi tuần máy tự chạy lại toàn bộ code để chắc vẫn ra đúng như video.

## Cách học

```bash
git clone https://github.com/duonghuyhieu/hoc-java.git
cd hoc-java
```

1. Xem video bài dự án, mở thư mục của ngày đó (vd `ngay-017`), đọc README, chạy từng file.
2. Làm bài trong thư mục `bai-lam/` (git bỏ qua thư mục này): chép thư mục ngày sang đó rồi sửa, vd `bai-lam/ngay-017/`. Đừng sửa thẳng file trong thư mục ngày.
3. Có bài dự án mới: `git pull` — vì bài của bạn nằm trong `bai-lam/` nên không bao giờ bị xung đột.

Không dùng git: nút **Code → Download ZIP**. Không muốn cài gì: nút **Mở bằng Codespaces** ở trên (chạy trên trình duyệt, tài khoản GitHub miễn phí có khoảng 60 giờ mỗi tháng).

## Cài đặt

JDK 25 (adoptium.net hoặc jdk.java.net). Chạy thẳng file, không cần biên dịch riêng:

```bash
java ngay-017/Buoc1.java
```

Windows mà chữ có dấu hiện thành `?`: chạy `chcp 65001` một lần trong cửa sổ đó, hoặc `java -Dstdout.encoding=UTF-8 ngay-017/Buoc1.java`.

## Các bài dự án

7/9 bài đã có code (khóa 100 ngày).

| Ngày | Bài | Code |
|---:|---|---|
| 17 | MINI: máy tính phí ship | [✅ ngay-017](ngay-017/) |
| 33 | DỰ ÁN CẤP 1 (1/3): máy tính tiền cửa hàng tiện lợi | [✅ ngay-033](ngay-033/) |
| 34 | DỰ ÁN CẤP 1 (2/3): máy tính tiền cửa hàng tiện lợi | [✅ ngay-034](ngay-034/) |
| 35 | DỰ ÁN CẤP 1 (3/3): máy tính tiền cửa hàng tiện lợi | [✅ ngay-035](ngay-035/) |
| 55 | MINI: thanh toán Tiền mặt/Thẻ/Ví bằng đa hình | [✅ ngay-055](ngay-055/) |
| 67 | DỰ ÁN CẤP 2 (1/2): Cửa hàng hướng đối tượng | [✅ ngay-067](ngay-067/) |
| 68 | DỰ ÁN CẤP 2 (2/2): Cửa hàng hướng đối tượng | [✅ ngay-068](ngay-068/) |
| 99 | DỰ ÁN CUỐI (1/2): Cửa hàng lên đời — lưu đơn ra file, báo cáo doanh thu bằng stream, ôn chặng | ⏳ sắp có |
| 100 | DỰ ÁN CUỐI (2/2): Cửa hàng lên đời — 1.000 đơn cùng lúc bằng virtual threads, test JUnit, học gì tiếp | ⏳ sắp có |

## Báo lỗi, hỏi bài

- Code chạy khác video, README sai: [Issues → Báo lỗi bài học](https://github.com/duonghuyhieu/hoc-java/issues/new/choose).
- Hỏi bài, nhờ giải thích: [Discussions](https://github.com/duonghuyhieu/hoc-java/discussions).

## Giấy phép

Code: MIT (`LICENSE`) — dùng thoải mái. Chữ trong README: CC BY 4.0 (`LICENSE-NOI-DUNG.md`) — dùng lại thì ghi công kênh Hiếu học mỗi ngày.
