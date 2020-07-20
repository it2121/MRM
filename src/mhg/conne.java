package mhg;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.mysql.jdbc.PreparedStatement;

public class conne {
	public static int fiw;
	public static int fih;
	public static String q;
	public static String qi;

	public static int a;
	public static String username;
	public static String passsword;
	static boolean found = false;
	public static String connection;
	public static String usernamea;
	public static String password;
	public static String type;
	public static int maxid;
	public static String userc = null;
	public static boolean usercb = false;
	public static String searchuser = null;
	public static String searchpass1;
	public static int searchid;
	public static String searchname;
	public static String searchadd;
	public static int searchlevel;
	public static boolean notfound = true;
	public static BufferedImage imagefromdb = null;
	public static ImageIcon imm;
	public static String fname = "";
	public static String mname;
	public static int seid;

	public static String lname;
	public static String birth;
	public static String gender;
	public static String mar;
	public static String ad;
	public static String blood;
	public static String phone;
	public static String email;
	public static String o;
	public static BufferedImage pic = null;
	public static ImageIcon ims;

	public static String cheifcomplaints;
	public static String HPCs;
	public static String PHs;
	public static String SHs;
	public static String DHs;
	public static boolean foundp = false;
	public static int idp;
	public static boolean foundpa = false;

	public static void selectpass(int id, String pass) {

	}

	public static void uppass(int seid2, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			String query = "UPDATE pin SET password = '" + pass
					+ "'  WHERE id = '" + seid2 + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");
			// FileInputStream is = new FileInputStream(pic);
			// pr.setString(1, pass);

			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.print("mothe fucker");
		} catch (Exception ex) {
			// System.out.println(e);

		}
	}

	public static void selectpa(int id, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from pin WHERE id = '"
					+ id + "' AND password = '" + pass + "'");

			while (rs.next()) {
				foundpa = true;
				idp = rs.getInt("id");
				// a = rs.getInt("level");
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void selectp(String id, String pass) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from pin WHERE id = '"
					+ id + "' AND password = '" + pass + "'");

			while (rs.next()) {
				foundp = true;
				idp = rs.getInt("id");
				// a = rs.getInt("level");
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	// public static String attachment;
	public static void updatepid(String f, String mi, String l, String b,
			String g, String o, String m, String a, String bl, String p,
			String e, String pic, int seid2) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "UPDATE pin SET Firstname = ?, Midname = ?, Lastname = ?,BirthDate = ?,gender = ?,occupation = ?,maritalstatus = ?,address = ?,bloodgroup = ?,phonenumber = ?,email = ?,pic = ? WHERE id = '"
					+ seid2 + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.println("fucker");
			FileInputStream is = new FileInputStream(pic);
			pr.setString(1, f);
			pr.setString(2, mi);
			pr.setString(3, l);
			pr.setString(4, b);
			pr.setString(5, g);
			pr.setString(6, o);
			pr.setString(7, m);
			pr.setString(8, a);
			pr.setString(9, bl);
			pr.setString(10, p);
			pr.setString(11, e);
			pr.setBlob(12, is);

			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.println("mothe fucker");
		} catch (Exception ex) {
			// System.out.println(e);

		}

	}

	public static void updatepidwothoutpic(String f, String mi, String l,
			String b, String g, String o, String m, String a, String bl,
			String p, String e, int id) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "UPDATE pin SET Firstname = ?, Midname = ?, Lastname = ?,BirthDate = ?,gender = ?,occupation = ?,maritalstatus = ?,address = ?,bloodgroup = ?,phonenumber = ?,email = ? WHERE id = '"
					+ id + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");
			// FileInputStream is = new FileInputStream(pic);
			// /System.out.print("mothe fucker");
			pr.setString(1, f);
			pr.setString(2, mi);
			pr.setString(3, l);
			pr.setString(4, b);
			pr.setString(5, g);
			pr.setString(6, o);
			pr.setString(7, m);
			pr.setString(8, a);
			pr.setString(9, bl);
			pr.setString(10, p);
			pr.setString(11, e);
			// pr.setBlob(12, is);

			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.print("mothe fucker");
		} catch (Exception ex) {
			System.out.println(e);

		}

	}

	public static void updatemh(String cheifcomplaint, String HPC, String PH,
			String SH, String DH, int seid2) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "UPDATE mhh1 SET cheifcomplaint = ?, HPC = ?, PH = ?,SH = ?,DH = ? WHERE id = '"
					+ seid2 + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");
			// FileInputStream is = new FileInputStream(pic);
			pr.setString(1, cheifcomplaint);
			pr.setString(2, HPC);
			pr.setString(3, PH);
			pr.setString(4, SH);
			pr.setString(5, DH);
			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.print("mothe fucker");
		} catch (Exception ex) {
			// System.out.println(e);

		}

	}

	public static void selectfnl(String f, String m, String l) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from pin Where Firstname = '" + f
							+ "'AND Midname = '" + m + "'AND Lastname = '" + l
							+ "'");

			while (rswse.next()) {
				fname = rswse.getString("Firstname");
				mname = rswse.getString("Midname");
				lname = rswse.getString("Lastname");
				birth = rswse.getString("BirthDate");
				gender = rswse.getString("gender");
				o = rswse.getString("occupation");
				mar = rswse.getString("maritalstatus");
				ad = rswse.getString("address");
				blood = rswse.getString("bloodgroup");
				phone = rswse.getString("phonenumber");
				email = rswse.getString("email");
				pic = ImageIO.read(rswse.getBinaryStream("pic"));
				seid = rswse.getInt("id");

			}

			con.close();
			con.close();
			Image ii;
			ImageIcon imagea;
			ims = new ImageIcon(pic);
			ii = ims.getImage();
		} catch (Exception e) {
			// System.out.println(e);

		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from mhh1 Where id = '" + seid
							+ "'");

			while (rswse.next()) {
				cheifcomplaints = rswse.getString("cheifcomplaint");
				HPCs = rswse.getString("HPC");
				PHs = rswse.getString("PH");
				SHs = rswse.getString("SH");
				DHs = rswse.getString("DH");

			}

			con.close();

		} catch (Exception e) {
			// System.out.println(e);

		}

	}

	public static void selectmh(String fi) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from mhh1 Where id =  '" + fi + "'");

			while (rswse.next()) {
				cheifcomplaints = rswse.getString("cheifcomplaint");
				HPCs = rswse.getString("HPC");
				PHs = rswse.getString("PH");
				SHs = rswse.getString("SH");
				DHs = rswse.getString("DH");

			}

			con.close();

		} catch (Exception e) {
			// System.out.println(e);

		}
	}

	public static void selectpic(String sid) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from pin Where id = '" + sid + "'");

			while (rswse.next()) {
				fname = rswse.getString("Firstname");
				mname = rswse.getString("Midname");
				lname = rswse.getString("Lastname");
				birth = rswse.getString("BirthDate");
				gender = rswse.getString("gender");
				o = rswse.getString("occupation");
				mar = rswse.getString("maritalstatus");
				ad = rswse.getString("address");
				blood = rswse.getString("bloodgroup");
				phone = rswse.getString("phonenumber");
				email = rswse.getString("email");
				pic = ImageIO.read(rswse.getBinaryStream("pic"));
				seid = rswse.getInt("id");

			}

			con.close();
			Image ii;
			ImageIcon imagea;
			ims = new ImageIcon(pic);
			ii = ims.getImage();

		} catch (Exception e) {
			// System.out.println(e);

		}

	}

	public static void getimage(String qaq)

	{

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/images", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM pics  WHERE id = '"
					+ qaq + "'");

			while (rs.next()) {
				imagefromdb = ImageIO.read(rs.getBinaryStream("pics"));
			}
			con.close();
			Image ii;
			ImageIcon imagea;
			imm = new ImageIcon(imagefromdb);
			ii = imm.getImage();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void getcon(String qq)

	{

		q = qq;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(q);

			while (rs.next()) {
				found = true;
				a = rs.getInt("level");
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void connected() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");
			connection = "Connected";

		} catch (Exception e) {
			connection = "Not Connected";

		}
	}

	public static void ins(String l, String f) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "");
			PreparedStatement statement = (PreparedStatement) con
					.prepareStatement("INSERT INTO fuck (name,age) VALUES ('"
							+ f + "','" + l + "')");
			statement.executeUpdate();
			statement.close();
			con.close();
			// System.out.println("fucker");
		} catch (Exception e) {
			// System.out.println("mother fucker");
		}
	}

	public static void fuck() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "");
			// InputStream is = new FileInputStream(new File(s));
			PreparedStatement ps = (PreparedStatement) con
					.prepareStatement("INSERT INTO fuck (name,age) VALUES ('textFiel','t')");

			// ps.setString(1, textField.getText());
			// ps.setString(2, textField_1.getText());
			// ps.setBlob(3, is);
			ps.executeUpdate();
			ps.close();
			con.close();
			System.out.println("hell yeah");
		} catch (Exception e) {
			System.out.println("h");
		}
	}

	public static void selectall() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cons = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "");
			Statement newone = cons.createStatement();
			Statement stmts = cons.createStatement();
			ResultSet rss = stmts
					.executeQuery("SELECT * FROM fuck  WHERE id = 13");
			ResultSet rss1 = newone
					.executeQuery("SELECT * FROM names  WHERE id = 1");

			while (rss.next() && rss1.next()) {

				System.out.println(rss.getString("age") + "  "
						+ rss1.getString("fname"));
			}
			cons.close();

		} catch (Exception e) {
			System.out.println("fuck off");

		}

	}

	public static void insertid(String fn, String mi, String la, String bi,
			String ge, String oc, String ma, String ad, String bl, String ph,
			String em, String pic, String pas) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection cona = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			PreparedStatement ps = (PreparedStatement) cona
					.prepareStatement("INSERT INTO pin (Firstname,Midname,Lastname,BirthDate,gender,occupation,maritalstatus,address,bloodgroup,phonenumber,email,pic,password) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
			FileInputStream is = new FileInputStream(pic);

			ps.setString(1, fn);
			ps.setString(2, mi);
			ps.setString(3, la);
			ps.setString(4, bi);
			ps.setString(5, ge);
			ps.setString(6, oc);
			ps.setString(7, ma);
			ps.setString(8, ad);
			ps.setString(9, bl);
			ps.setString(10, ph);
			ps.setString(11, em);
			ps.setBlob(12, is);
			ps.setString(13, pas);
			// System.out.println("hell yeah i");
			ps.executeUpdate();
			ps.close();
			cona.close();
			// System.out.println("hell i");
		} catch (Exception ex) {
			// System.out.println("id f");
		}
	}

	public static void insertmsh(String cheifcomplaint1, String HPC1,
			String PH1, String SH1, String DH1) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conai = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");
			// String q =
			// "INSERT INTO mhh1 (cheifcomplaint,HPC,PH,SH,DH,attachment) VALUES ('"
			// + cheifcomplaint1
			// + "','"
			// + HPC1
			// + "','"
			// + PH1
			// + "','"
			// + SH1 + "','" + DH1 + "','" + attachment + "')";
			PreparedStatement psi = (PreparedStatement) conai
					.prepareStatement("INSERT INTO mhh1 (cheifcomplaint,HPC,PH,SH,DH) VALUES (?,?,?,?)");
			// INSERT INTO `mhh1`(`id`, `cheifcomplaint`, `HPC`, `PH`, `SH`,
			// `DH`, `attachment`) VALUES
			// ([value-1],[value-2],[value-3],[value-4],[value-5],[value-6],[value-7])

			psi.setString(1, cheifcomplaint1);
			psi.setString(2, HPC1);
			psi.setString(3, PH1);
			psi.setString(4, SH1);
			psi.setString(5, DH1);
			psi.executeUpdate();

			System.out.println("hell ms");
		} catch (Exception ex) {
			System.out.println("mi f");
		}
	}

	public static void insertthefuck(String cheifcomplaint, String HPC,
			String PH, String SH, String DH, String attachment) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conaa = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			PreparedStatement psa = (PreparedStatement) conaa
					.prepareStatement("INSERT INTO mhh1 (cheifcomplaint,HPC,PH,SH,DH,attachment) VALUES (?,?,?,?,?,?)");
			FileInputStream isa = new FileInputStream(attachment);

			psa.setString(1, cheifcomplaint);
			psa.setString(2, HPC);
			psa.setString(3, PH);
			psa.setString(4, SH);
			psa.setString(5, DH);
			psa.setBlob(6, isa);

			psa.executeUpdate();
			psa.close();
			conaa.close();

		} catch (Exception ex) {
		}

	}

	public static void insertthefuckw(String cheifcomplaint, String HPC,
			String PH, String SH, String DH) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conaa = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			PreparedStatement psa = (PreparedStatement) conaa
					.prepareStatement("INSERT INTO mhh1 (cheifcomplaint,HPC,PH,SH,DH) VALUES (?,?,?,?,?)");
			// FileInputStream isa = new FileInputStream(attachment);

			psa.setString(1, cheifcomplaint);
			psa.setString(2, HPC);
			psa.setString(3, PH);
			psa.setString(4, SH);
			psa.setString(5, DH);

			psa.executeUpdate();
			psa.close();
			conaa.close();

		} catch (Exception ex) {
		}

	}

	public static void resize(int wa, int ha, int iwa, int iha) {

		int w = wa;
		int h = ha;
		int iw = iwa;
		int ih = iha;
		while (iw > w || ih > h) {
			iw--;
			ih--;

		}

		fiw = iw;
		fih = ih;
	}

	public static void setadmin(String user, String pass, int level,
			String name, String addr) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection conaa = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			PreparedStatement psa = (PreparedStatement) conaa
					.prepareStatement("INSERT INTO admins (username,passsword,level,name,addr) VALUES (?,?,?,?,?)");
			// FileInputStream isa = new FileInputStream(attachment);

			psa.setString(1, user);
			psa.setString(2, pass);
			psa.setInt(3, level);
			psa.setString(4, name);
			psa.setString(5, addr);

			psa.executeUpdate();
			psa.close();
			conaa.close();

		} catch (Exception ex) {
		}

	}

	public static void maxid() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rsw = stmt.executeQuery("SELECT * from admins");

			while (rsw.next()) {

				maxid = rsw.getInt("id");

			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void usercheck(String s) {
		conne.usercb = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rsw = stmt
					.executeQuery("SELECT * from admins Where username = '" + s
							+ "'");

			while (rsw.next()) {
				userc = rsw.getString("username");
				usercb = true;
			}

			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void searchusername(String s) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from admins Where username = '" + s
							+ "'");

			while (rswse.next()) {
				searchuser = rswse.getString("username");
				searchpass1 = rswse.getString("passsword");
				searchname = rswse.getString("name");
				searchadd = rswse.getString("addr");
				searchlevel = rswse.getInt("level");
				searchid = rswse.getInt("id");
			}
			notfound = false;
			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public static void searchid(String s) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			Statement stmt = con.createStatement();
			ResultSet rswse = stmt
					.executeQuery("SELECT * from admins Where id = '" + s + "'");

			while (rswse.next()) {
				searchuser = rswse.getString("username");
				searchpass1 = rswse.getString("passsword");
				searchname = rswse.getString("name");
				searchadd = rswse.getString("addr");
				searchlevel = rswse.getInt("level");
				searchid = rswse.getInt("id");

			}
			notfound = false;

			con.close();

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void upload(String useru, String passu, int levelu, String nameu,
			String addru, String idu) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ? WHERE username = '"
					+ idu + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");

			pr.setString(1, useru);
			pr.setString(2, passu);
			pr.setInt(3, levelu);
			pr.setString(4, nameu);
			pr.setString(5, addru);
			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.print("mothe fucker");
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void uploadu(String useru, String passu, int levelu,
			String nameu, String addru, String usera) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ? WHERE username = '"
					+ usera + "'";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");

			pr.setString(1, useru);
			pr.setString(2, passu);
			pr.setInt(3, levelu);
			pr.setString(4, nameu);
			pr.setString(5, addru);
			// pr.setInt(6, idu);
			pr.executeUpdate();
			con.close();
			// System.out.print("mothe fucker");
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void deleteall(int i) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "delete from pin WHERE id = ?";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");

			// pr.setInt(6, idu);
			pr.setInt(1, i);
			pr.execute();
			con.close();
			// System.out.print("m");
		} catch (Exception e) {
			System.out.println(e);

		}
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mh", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "delete from mhh1 WHERE id = ?";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");

			// pr.setInt(6, idu);
			pr.setInt(1, i);
			pr.execute();
			con.close();
			// System.out.print("m");
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void delete(int i) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/admins", "root", "");

			// Statement stmt = con.createStatement();
			// ResultSet rswsu = stmt
			// .executeQuery("UPDATE admins SET username = ?, passsword = ?, level = ?,name = ?,addr = ?, WHERE id = '"
			// + idu + "'");
			String query = "delete from admins WHERE id = ?";
			PreparedStatement pr = (PreparedStatement) con
					.prepareStatement(query);
			// System.out.print("fucker");

			// pr.setInt(6, idu);
			pr.setInt(1, i);
			pr.execute();
			con.close();
			// System.out.print("m");
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void main(String[] args) {

	}
}
