# Dairyreport

## 概要
Java / JSP / Servlet / SQL を用いて開発した Web アプリケーションです。
ユーザー管理やデータ登録・検索などの CRUD 処理を実装し、MVC 設計と DB 連携を学習目的で作成しました。

---------------

## 開発環境
| 項目 | 内容 |
| ---------- |
| 言語 | Java (JDK 24 など) |
| フレームワーク | Servlet / JSP (Jakarta EE) |
| データベース | h2 |
| ビルドツール |  |
| アプリケーションサーバー | Apache Tomcat 10.x |
| IDE | Eclipse / VS Code |
| バージョン管理 | Git / GitHub |
| OS | Windows |

---------------

## 機能一覧
| カテゴリ | 内容 |
| -------------- |
| ユーザー管理 | 新規ユーザー登録 / ログイン / ログアウト / パスワード変更 |
| データ登録 | フォーム入力によるデータ追加 |
| セッション管理 | ログインユーザーの情報の保持とアクセス制御 |
| エラーハンドリング | 例外処理 / 入力エラーメッセージ表示 |

---------------

## ディレクトリ構成
### 11/14 ログイン機能
LoginApp/
├─ src/
│  ├─ controller/ (Servlet)
│  │   ├─ LoginServlet.java
│  │   ├─ RegisterServlet.java
│  │   ├─ RegisterConfirmServlet.java
│  │   ├─ ChangePasswordServlet.java
│  │   └─ ChangePasswordConfirmServlet.java
│  ├─ model/ (DAO, DTO)
│  │   ├─ User.java
│  │   └─ UserDAO.java
│  └─ util/ (共通ロジック)
│      └─ DBConnection.java
│
├─ WEB-INF/
│  ├─jsp
│  │  ├─ login.jsp
│  │  ├─ register.jsp
│  │  ├─ registerConfirm.jsp
│  │  ├─ changePassword.jsp
│  │  ├─ changePasswordConfirm.jsp
│  │  ├─ success.jsp
│  │  ├─ error.jsp
│  └─lib

---------------

## データベース構成


### テーブル定義例 : user_table
| カラム名 | 型 | 説明 |
| ------------------- |
| user_id | INT | 主キー (AUTO_INCREMENT) |
| password | VARCHAR (100) | パスワード |
| user_name | VARCHAR (50) | ユーザー名 |

---------------

## 設計方針 / 工夫点
- MVC 設計 : Controller (Servlet)、Model (DAO など)、View (JSP) を分離

---------------

## ライセンス・著作権
このプロジェクトは学習目的で作成したものであり、商用利用は想定していません。
各種ライブラリ・ツールのライセンスはそれぞれの作者に帰属します。

---------------

## 作成者
- 氏名 : J3690
- 開発期間 : 2025/11 ~ 2025/12