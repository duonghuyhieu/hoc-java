"""Chạy mọi file buoc*/Buoc* như học viên, so stdout với khối «Kết quả» trong README cùng thư mục.
File loi*/Loi* chỉ cần báo lỗi (mã thoát khác 0). Biến môi trường PYTHON / JAVA / NODE đổi lệnh chạy.

  python tools/kiem.py
"""
import os
import re
import subprocess
import sys
from pathlib import Path

GOC = Path(__file__).resolve().parents[1]
LENH = {".py": [os.environ.get("PYTHON", sys.executable)],
        ".java": [os.environ.get("JAVA", "java"), "-Dstdout.encoding=UTF-8"],
        ".ts": [os.environ.get("NODE", "node")]}


def main() -> int:
    sys.stdout.reconfigure(encoding="utf-8")
    dung = sai = bo = 0
    thieu = [d.name for d in sorted(GOC.glob("ngay-*")) if d.is_dir() and not (d / "README.md").exists()]
    for d in thieu:
        print(f"THIẾU README: {d}")
    for f in sorted(GOC.glob("ngay-*/*")):
        if f.suffix not in LENH:
            continue
        md = (f.parent / "README.md").read_text(encoding="utf-8")
        muc = re.search(rf"File `{re.escape(f.name)}`(.*?)(?=\n### |\n## |\Z)", md, re.S)
        if not muc:
            print(f"README không nhắc {f.relative_to(GOC)}")
            sai += 1
            continue
        if "Số sau `@` khác mỗi lần chạy" in muc.group(1):
            bo += 1                               # in mã băm đối tượng — không so được từng chữ
            continue
        m = re.search(r"\n```text\n(.*?)\n```", muc.group(1), re.S)
        mong = m.group(1).splitlines() if m else []
        r = subprocess.run(LENH[f.suffix] + [f.name], cwd=f.parent, capture_output=True, text=True,
                           encoding="utf-8", errors="replace", timeout=120)
        if f.stem.lower().startswith("loi"):
            ok = r.returncode != 0
        else:
            ok = r.returncode == 0 and r.stdout.rstrip("\n").splitlines() == mong
        if ok:
            dung += 1
        else:
            sai += 1
            print(f"LỆCH {f.relative_to(GOC)} (mã thoát {r.returncode})\n  README: {mong[:5]}\n"
                  f"  chạy ra: {r.stdout.splitlines()[:5]}\n  lỗi: {r.stderr.strip()[-300:]}")
    print(f"{dung} file đúng, {sai} lệch, {bo} bỏ qua" + (f", {len(thieu)} thư mục thiếu README" if thieu else ""))
    return 1 if sai or thieu else 0


if __name__ == "__main__":
    raise SystemExit(main())
