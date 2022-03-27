package pro_2;

import java.awt.Canvas;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.SystemColor;

public class mini2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField su_name;
	private JTextField su_phno;
	private JPasswordField su_np;
	private JTextField log_name;
	private JPasswordField log_pw;
	private JTextField textField_3;
	private JPasswordField passwordField_2;
	private JTextField ucn;
	private JTextField uemail;
	private JTextField uadd;
	private JTable ctable;
	private JTextField log_phno;
	int count=0;
	int count1=0;
	int count2=0;
	int count3=0;
	int x=0;
	String lname;
	String lpw;
	String lphno,name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Connect();
					mini2 frame = new mini2();
					frame.setVisible(true);
					frame.setResizable(false); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static Connection con;
	PreparedStatement q,q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16;
	private JTable table;
	public static void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ajp_mini1_problems", "root","");
		}catch(ClassNotFoundException ex) {
			
		}catch(SQLException ex) {
			
		}
	}
	/**
	 * Create the frame.
	 */
	public mini2() {
		setBackground(SystemColor.activeCaption);
	
		setType(Type.POPUP);
		setForeground(Color.BLACK);
		setTitle("                                                                                                                                                                      Socity Grievances Dashboard");
		getContentPane().setBackground(Color.WHITE);
		setBounds(100, 100, 1261, 734);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 217, 695);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setBounds(28, 41, 159, 159);
		panel_1.add(lblNewLabel_14);
		lblNewLabel_14.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\11.png"));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(216, 0, 1031, 695);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(255, 215, 0)));
		panel_2.setBackground(new Color(255, 255, 224));
		layeredPane.add(panel_2, "name_205097766966000");
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Place to Raise Your queries  ");
		lblNewLabel_2.setBounds(156, 67, 591, 72);
		lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 40));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7_1.setBounds(589, 636, 399, 28);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\review (2).png"));
		lblNewLabel_13.setBounds(782, 44, 159, 159);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setBounds(39, 484, 157, 157);
		panel_2.add(lblNewLabel_9);
		lblNewLabel_9.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\review (1).png"));
		
		JLabel lblNewLabel_2_1 = new JLabel("Make Your Login ");
		lblNewLabel_2_1.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_2_1.setBounds(234, 213, 591, 72);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Mark Your Problem");
		lblNewLabel_2_1_1.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_2_1_1.setBounds(234, 275, 591, 72);
		panel_2.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Make Your Mind Free");
		lblNewLabel_2_1_1_1.setFont(new Font("Georgia", Font.BOLD, 40));
		lblNewLabel_2_1_1_1.setBounds(234, 336, 591, 72);
		panel_2.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		layeredPane.add(panel_3, "name_205102340774100");
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBackground(new Color(255, 255, 255));
		panel_3.add(layeredPane_1, "name_206540094949000");
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 240, 245));
		layeredPane_1.add(panel_12, "name_9634822334300");
		
		JButton btnNewButton_3_1 = new JButton("Logout");
		btnNewButton_3_1.setBounds(869, 32, 120, 35);
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		panel_12.setLayout(null);
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_12.add(btnNewButton_3_1);
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(177, 89, 854, 606);
		panel_12.add(layeredPane_2);
		layeredPane_2.setLayout(new CardLayout(0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(47, 79, 79)));
		panel_15.setBackground(new Color(240, 255, 240));
		layeredPane_2.add(panel_15, "name_12076216208500");
		panel_15.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("Welcome!!!");
		lblNewLabel_15.setBounds(253, 98, 303, 153);
		lblNewLabel_15.setFont(new Font("Yu Gothic UI", Font.BOLD, 55));
		panel_15.add(lblNewLabel_15);
		
		JLabel lblNewLabel_15_1 = new JLabel("Admin");
		lblNewLabel_15_1.setBounds(303, 195, 303, 153);
		lblNewLabel_15_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 55));
		panel_15.add(lblNewLabel_15_1);
		
		JLabel lblNewLabel_7_5 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_5.setBounds(474, 553, 399, 28);
		lblNewLabel_7_5.setFont(new Font("Times New Roman", Font.BOLD, 17));
		panel_15.add(lblNewLabel_7_5);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(218, 165, 32)));
		panel_20.setBackground(new Color(250, 250, 210));
		layeredPane_2.add(panel_20, "name_1273213171950200");
		panel_20.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\rec.png"));
		lblNewLabel_10.setBackground(new Color(240, 240, 240));
		lblNewLabel_10.setBounds(325, 129, 203, 206);
		panel_20.add(lblNewLabel_10);
		
		JLabel countlabel = new JLabel("0");
		countlabel.setFont(new Font("Times New Roman", Font.BOLD, 62));
		countlabel.setBounds(389, 361, 109, 54);
		panel_20.add(countlabel);
		
		JLabel lblNewLabel_16 = new JLabel("Total Count Recorded");
		lblNewLabel_16.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
		lblNewLabel_16.setBounds(242, 51, 484, 54);
		panel_20.add(lblNewLabel_16);
		
		JLabel lblNewLabel_7_4 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_4.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7_4.setBounds(470, 550, 399, 28);
		panel_20.add(lblNewLabel_7_4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(139, 69, 19)));
		panel_14.setBackground(new Color(250, 240, 230));
		layeredPane_2.add(panel_14, "name_12072447466600");
		panel_14.setLayout(null);
		
		JComboBox recordadmin = new JComboBox();
		recordadmin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		recordadmin.setForeground(new Color(0, 0, 0));
		recordadmin.setModel(new DefaultComboBoxModel(new String[] {"Ariyalur", "Chengalpattu", "Chennai", "Coimbatore", "Cuddalore", "Dharmapuri", "Dindigul", "Erode", "Kallakurichi", "Kanchipuram", "Kanyakumari", "Karur", "Krishnagiri", "Madurai", "Nagapattinam", "Namakkal", "Nilgiris", "Perambalur", "Pudukkottai", "Ramanathapuram", "Ranipet", "Salem", "Sivaganga", "Tenkasi", "Thanjavur", "Theni", "Thoothukudi (Tuticorin)", "Tiruchirappalli", "Tirunelveli", "Tirupathur", "Tiruppur", "Tiruvallur", "Tiruvannamalai", "Tiruvarur", "Vellore", "Viluppuram", "Virudhunagar"}));
		recordadmin.setSelectedIndex(1);
		recordadmin.setMaximumRowCount(32);
		recordadmin.setBounds(429, 62, 177, 23);
		panel_14.add(recordadmin);
		
		JLabel lblNewLabel_11 = new JLabel("Select The District To View The Count");
		lblNewLabel_11.setForeground(new Color(0, 0, 0));
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_11.setBounds(90, 62, 316, 21);
		panel_14.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\rec1.png"));
		lblNewLabel_12.setBounds(328, 159, 191, 190);
		panel_14.add(lblNewLabel_12);
		
		JLabel countdist = new JLabel("0\r\n");
		countdist.setFont(new Font("Times New Roman", Font.BOLD, 54));
		countdist.setBounds(392, 376, 139, 40);
		panel_14.add(countdist);
		
		JButton Show = new JButton("Show");
		Show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String cd=(String)recordadmin.getSelectedItem();
					int co;
					q15=con.prepareStatement("SELECT count(*) from problem_record where district=?");
					q15.setString(1,cd);
					ResultSet r1=q15.executeQuery();
					r1.next();
					co=r1.getInt(1);
					countdist.setText(String.valueOf(co));
					
					layeredPane_2.removeAll();
					layeredPane_2.add(panel_14);
					layeredPane_2.repaint();
					layeredPane_2.revalidate();
					}catch(Exception m) {
						System.out.println(m);
					}
			}});
		Show.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Show.setBounds(617, 62, 95, 23);
		panel_14.add(Show);
		
		JLabel lblNewLabel_7_3 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7_3.setBounds(455, 550, 399, 28);
		panel_14.add(lblNewLabel_7_3);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(72, 61, 139)));
		panel_13.setBackground(new Color(230, 230, 250));
		layeredPane_2.add(panel_13, "name_12027013345800");
		panel_13.setLayout(null);
		
		JScrollPane scrollPane_12 = new JScrollPane();
		scrollPane_12.setBounds(131, 120, 614, 347);
		panel_13.add(scrollPane_12);
		
		DefaultTableModel model1=new DefaultTableModel();
		table = new JTable();
		scrollPane_12.setViewportView(table);
		Object[] column1 = {"Name", "Phone no", "Email id", "Gender", "District", "Character", "Problem", "Address"};
		Object[] row1=new Object[8];
		model1.setColumnIdentifiers(column1);
		table.setModel(model1);
		
		JLabel lblNewLabel_7_2 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7_2.setBounds(445, 547, 399, 28);
		panel_13.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_17 = new JLabel("View Records");
		lblNewLabel_17.setFont(new Font("Tekton Pro Ext", Font.BOLD, 36));
		lblNewLabel_17.setBounds(291, 51, 297, 54);
		panel_13.add(lblNewLabel_17);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 89, 179, 234);
		panel_12.add(scrollPane_1);
		
		JTree tree = new JTree();
		scrollPane_1.setViewportView(tree);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("ADMIN") {
				{
						
						  DefaultMutableTreeNode node_1; node_1 = new
						  DefaultMutableTreeNode("Data_Records"); node_1.add(new
						  DefaultMutableTreeNode("Total_responses")); node_1.add(new
						  DefaultMutableTreeNode("District_wise_responses"));
					add(node_1); 
						  node_1 = new DefaultMutableTreeNode("View_Records"); 
						  node_1.add(new DefaultMutableTreeNode("Whole_view")); 
						add(node_1);						  
				}
			}
		));
		
		tree.addTreeSelectionListener(new TreeSelectionListener() {

				public void valueChanged(TreeSelectionEvent e)
					{
						DefaultMutableTreeNode selected=(DefaultMutableTreeNode)tree.getLastSelectedPathComponent();
						String selected_node=selected.toString();
						if(selected_node.equals("Total_responses"))
						{
							try {
							int cl;
							q14=con.prepareStatement("SELECT count(*) from problem_record");
							ResultSet r1=q14.executeQuery();
							r1.next();
							cl=r1.getInt(1);
							countlabel.setText(String.valueOf(cl));
							
							layeredPane_2.removeAll();
							layeredPane_2.add(panel_20);
							layeredPane_2.repaint();
							layeredPane_2.revalidate();}catch(Exception v) {
								System.out.println(v);
							}
						}
						else if(selected_node.equals("District_wise_responses"))
						{
							try {
							
							
							layeredPane_2.removeAll();
							layeredPane_2.add(panel_14);
							layeredPane_2.repaint();
							layeredPane_2.revalidate();
							}catch(Exception m) {
								System.out.println(m);
							}

						}
						else if(selected_node.equals("Whole_view"))
						{
							try {
								
								model1.setRowCount(0);
								model1.setColumnCount(0);
								
								Object[] column1 = {"Name", "Phone no", "Email id", "Gender", "District", "Character", "Problem", "Address"};
								Object[] row1=new Object[8];
								model1.setColumnIdentifiers(column1);
								table.setModel(model1);
								
								q16=con.prepareStatement("SELECT cname,contact_no,emial_id,gender,district,characteristics,problem,address from problem_record");
								ResultSet r2=q16.executeQuery();
								
								while(r2.next()) {
									
										row1[0]=r2.getString("cname");
										row1[1]=r2.getString("contact_no");
										row1[2]=r2.getString("emial_id");
										row1[3]=r2.getString("gender");
										row1[4]=r2.getString("district");
										row1[5]=r2.getString("characteristics");
										row1[6]=r2.getString("problem");
										row1[7]=r2.getString("address");
										model1.addRow(row1);
								}
								
							layeredPane_2.removeAll();
							layeredPane_2.add(panel_13);
							layeredPane_2.repaint();
							layeredPane_2.revalidate();}catch(Exception n)
							{
								System.out.println(n);
							}
						}
				/*
				 * else if(selected_node.equals("District_wise_Wise")) {
				 * layeredPane_2.removeAll(); layeredPane_2.add(panel_18);
				 * layeredPane_2.repaint(); layeredPane_2.revalidate(); }
				 */
					}
		});
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(240, 128, 128)));
		panel.setBackground(new Color(255, 250, 250));
		layeredPane_1.add(panel, "name_206560682526600");
		panel.setLayout(null);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		panel_19.setBackground(new Color(255, 192, 203));
		panel_19.setBounds(10, 36, 1011, 59);
		panel.add(panel_19);
		panel_19.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                             Welcome to Society Grievances DashBoard");
		lblNewLabel.setBounds(10, 10, 872, 44);
		panel_19.add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel.setBackground(Color.PINK);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(32, 151, 965, 504);
		panel.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new CompoundBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(0, 100, 0)), null));
		panel_6.setBackground(new Color(240, 255, 240));
		tabbedPane.addTab("User SignUp", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(0, 100, 0)));
		panel_9.setBackground(new Color(240, 255, 240));
		panel_9.setBounds(235, 90, 481, 303);
		panel_6.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User Name ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(99, 85, 100, 34);
		panel_9.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone_No");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(99, 125, 90, 34);
		panel_9.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New Password");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(99, 165, 126, 34);
		panel_9.add(lblNewLabel_1_2);
		
		su_name = new JTextField();
		su_name.setColumns(10);
		su_name.setBounds(250, 85, 150, 26);
		panel_9.add(su_name);
		
		su_phno = new JTextField();
		su_phno.setColumns(10);
		su_phno.setBounds(250, 125, 150, 26);
		panel_9.add(su_phno);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(224, 255, 255));
		layeredPane_1.add(panel_5, "name_206583688687800");
		panel_5.setLayout(null);
		JLabel user_lb = new JLabel();
		user_lb.setFont(new Font("Times New Roman", Font.BOLD, 36));
		user_lb.setBounds(284, 24, 486, 48);
		user_lb.setText("Welcome "+lname+" !!!");
		panel_5.add(user_lb);
		//signup
		su_np = new JPasswordField();
		su_np.setBounds(250, 165, 150, 26);
		panel_9.add(su_np);
		JButton btnNewButton_2 = new JButton("Submit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (su_name.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter Username !!!");
				  }
				else if (su_phno.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter PhoneNumber !!!");
				  }
				else if (su_np.getText().length()==0)
				  {
					JOptionPane.showMessageDialog(null, "Enter password !!!");
				  }
				else {
						Connect();
						String name,np,phno;
						name=su_name.getText();
						phno=su_phno.getText();
						
						np=su_np.getText();
						try {
								
								q3=con.prepareStatement("SELECT phone_no from user_details");
								ResultSet r1=q3.executeQuery();
								
								while(r1.next())
								{
								
									//int ph1=Integer.parseInt(phno);
									//int ph2=Integer.parseInt(r1.getString("phone_no"));
									String s=r1.getString("phone_no"); 
									if(phno.equals(s))
									{
									count = 1;	
									break;
									}
								}
						}catch (NumberFormatException ex){
				            ex.printStackTrace();
				        }
						catch (SQLException e1) {						
						}
					
										
					if(count==1){
						String s="This phone number already registered !!!";
						JOptionPane.showMessageDialog(null, s);
						//su_name.setText("");
						su_phno.setText("");
						su_np.setText("");	
						count=0;
					}
					else 
					{	
						try {
							q=con.prepareStatement("insert into user_details(username,phone_no,new_password)values(?,?,?)");
							q1=con.prepareStatement("insert into problem_record(phone_no,name)values(?,?)");
							q.setString(1, name);
							q.setString(2, phno);
							q.setString(3, np);
							q.executeUpdate();
							q1.setString(1,phno);
							q1.setString(2,name);
							q1.executeUpdate();
							su_name.setText("");
							su_phno.setText("");
							su_np.setText("");
						}
						catch (SQLException e1)
						{						
						}
						JOptionPane.showMessageDialog(null,"Hi "+name+" -- SignUp Success Full !!!");
						/*layeredPane.removeAll();
						layeredPane.add(panel_5);
						layeredPane.repaint();
						layeredPane.revalidate();
						user_lb.setText("Welcome "+name+" !!!");
						panel_5.revalidate();
						panel_5.repaint();*/
						tabbedPane.setSelectedIndex(1);
					}
				}
			}
		});
		btnNewButton_2.setBackground(new Color(0, 128, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBounds(344, 251, 107, 26);
		panel_9.add(btnNewButton_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\User-Group-icon.png"));
		lblNewLabel_3_2.setBounds(193, 10, 64, 63);
		panel_9.add(lblNewLabel_3_2);
		
		JCheckBox sp_cb = new JCheckBox("");
		sp_cb.setBounds(410, 165, 21, 26);
		panel_9.add(sp_cb);
		sp_cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(sp_cb.isSelected()) {
					su_np.setEchoChar((char)0);
				}else {
					su_np.setEchoChar('⚫');
				}
			}
		});
		
		JLabel lblNewLabel_4_2 = new JLabel("User SignUp");
		lblNewLabel_4_2.setForeground(Color.GRAY);
		lblNewLabel_4_2.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel_4_2.setBounds(363, 31, 180, 38);
		panel_6.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Already have an account !-");
		lblNewLabel_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2_2.setBounds(328, 415, 166, 34);
		panel_6.add(lblNewLabel_1_2_2);
		
		JButton btnNewButton_5 = new JButton("Login");
		btnNewButton_5.setBackground(new Color(240, 255, 240));
		btnNewButton_5.setForeground(new Color(0, 0, 0));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		btnNewButton_5.setBounds(504, 423, 85, 21);
		panel_6.add(btnNewButton_5);
		
		
		
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(255, 20, 147)));
		panel_7.setBackground(new Color(255, 240, 245));
		tabbedPane.addTab("User Login", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(255, 20, 147)));
		panel_9_1.setBackground(new Color(255, 240, 245));
		panel_9_1.setBounds(235, 90, 481, 303);
		panel_7.add(panel_9_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("User Name ");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(99, 96, 100, 34);
		panel_9_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Password");
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBounds(99, 175, 126, 34);
		panel_9_1.add(lblNewLabel_1_2_1);
		
		log_name = new JTextField();
		log_name.setColumns(10);
		log_name.setBounds(250, 103, 150, 26);
		panel_9_1.add(log_name);
		
		log_pw = new JPasswordField();
		log_pw.setBounds(250, 175, 150, 26);
		panel_9_1.add(log_pw);
		
		
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(20, 85, 988, 583);
		panel_5.add(tabbedPane_1);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(128, 0, 128)));
		panel_10.setBackground(new Color(230, 230, 250));
		tabbedPane_1.addTab("Enter_Details", null, panel_10, null);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Contact No");
		lblNewLabel_1_4_1.setBounds(70, 86, 100, 34);
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_10.add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("Email_Id");
		lblNewLabel_1_4_2.setBounds(70, 161, 100, 34);
		lblNewLabel_1_4_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_10.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_2_1 = new JLabel("Gender");
		lblNewLabel_1_4_2_1.setBounds(70, 208, 100, 34);
		lblNewLabel_1_4_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_10.add(lblNewLabel_1_4_2_1);
		
		JLabel lblNewLabel_1_4_2_1_1 = new JLabel("District");
		lblNewLabel_1_4_2_1_1.setBounds(70, 251, 100, 34);
		lblNewLabel_1_4_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_10.add(lblNewLabel_1_4_2_1_1);
		
		JComboBox udist = new JComboBox();
		udist.setBounds(232, 260, 146, 21);
		udist.setModel(new DefaultComboBoxModel(new String[] {"Ariyalur", "Chengalpattu", "Chennai", "Coimbatore", "Cuddalore", "Dharmapuri", "Dindigul", "Erode", "Kallakurichi", "Kanchipuram", "Kanyakumari", "Karur", "Krishnagiri", "Madurai", "Nagapattinam", "Namakkal", "Nilgiris", "Perambalur", "Pudukkottai", "Ramanathapuram", "Ranipet", "Salem", "Sivaganga", "Tenkasi", "Thanjavur", "Theni", "Thoothukudi (Tuticorin)", "Tiruchirappalli", "Tirunelveli", "Tirupathur", "Tiruppur", "Tiruvallur", "Tiruvannamalai", "Tiruvarur", "Vellore", "Viluppuram", "Virudhunagar"}));
		udist.setSelectedIndex(1);
		udist.setMaximumRowCount(32);
		panel_10.add(udist);
		
		ucn = new JTextField();
		ucn.setBounds(232, 89, 146, 34);
		ucn.setColumns(10);
		panel_10.add(ucn);
		
		uemail = new JTextField();
		uemail.setBounds(232, 161, 146, 34);
		uemail.setColumns(10);
		panel_10.add(uemail);
		
		JRadioButton urm = new JRadioButton("Male");
		urm.setBounds(233, 217, 59, 21);
		urm.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_10.add(urm);
		
		JRadioButton urf = new JRadioButton("Female");
		urf.setBounds(294, 217, 69, 21);
		urf.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_10.add(urf);
		
		JRadioButton urt = new JRadioButton("Trans");
		urt.setBounds(365, 217, 59, 21);
		urt.setFont(new Font("Tahoma", Font.BOLD, 10));
		panel_10.add(urt);
		
		ButtonGroup bg=new ButtonGroup();    
		bg.add(urm);
		bg.add(urf);
		bg.add(urt);
		
		JLabel lblNewLabel_8 = new JLabel("Charaterstics of Yourself :");
		lblNewLabel_8.setBounds(68, 309, 449, 21);
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_10.add(lblNewLabel_8);
		
		JCheckBox uc1 = new JCheckBox("Adaptable Person");
		uc1.setBounds(233, 355, 145, 28);
		uc1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_10.add(uc1);
		
		JCheckBox uc2 = new JCheckBox("Creative thinker");
		uc2.setBounds(232, 390, 146, 28);
		uc2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_10.add(uc2);
		
		JCheckBox uc3 = new JCheckBox("Honest Person");
		uc3.setBounds(232, 425, 146, 28);
		uc3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_10.add(uc3);
		
		JCheckBox uc4 = new JCheckBox("Deep Listener");
		uc4.setBounds(232, 465, 146, 28);
		uc4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		panel_10.add(uc4);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 0, 128)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_17.setBounds(535, 304, 358, 117);
		panel_10.add(panel_17);
		panel_17.setLayout(null);
		
		uadd = new JTextField();
		uadd.setBounds(6, 15, 346, 96);
		panel_17.add(uadd);
		uadd.setFont(new Font("Times New Roman", Font.BOLD, 17));
		uadd.setHorizontalAlignment(SwingConstants.LEFT);
		uadd.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(128, 0, 128)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(128, 0, 128)));
		panel_16.setBounds(535, 103, 358, 140);
		panel_10.add(panel_16);
		panel_16.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 15, 346, 119);
		panel_16.add(scrollPane);
		
		JList ulist = new JList();
		scrollPane.setViewportView(ulist);
		ulist.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ulist.setModel(new AbstractListModel() {
			String[] values = new String[] {"Healthcare System", "Basic Sanitation", "Education System", "Corruption", "Women\u2019s Safety", "Agricultural Distress", "Political Interference", "Problems Of Children", "Water scarcity", "Agricultural Distress", "Poverty", "Homelessness", "Gender Inequality", "Poor Leadership"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JLabel lblNewLabel_8_1 = new JLabel("Problem Faced In Your Area :");
		lblNewLabel_8_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_8_1.setBounds(542, 66, 297, 21);
		panel_10.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_1_4_2_1_1_1 = new JLabel("Personal Address :");
		lblNewLabel_1_4_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_4_2_1_1_1.setBounds(541, 264, 176, 34);
		panel_10.add(lblNewLabel_1_4_2_1_1_1);
		

		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(128, 0, 128)));
		panel_11.setBackground(new Color(230, 230, 250));
		tabbedPane_1.addTab("View_Details", null, panel_11, null);
		panel_11.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(139, 92, 731, 339);
		panel_11.add(scrollPane_2);
		
		//table
		DefaultTableModel model=new DefaultTableModel();
		ctable = new JTable();
		scrollPane_2.setViewportView(ctable);
		Object[] column = {"Name", "Phone no", "Email id", "Gender", "District", "Character", "Problem", "Address"};
		Object[] row=new Object[8];
		model.setColumnIdentifiers(column);
		ctable.setModel(model);
		
		JButton usubmit = new JButton("Submit");
		usubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					//String cname=log_name.getText();
					String cn=ucn.getText();
					String em=uemail.getText();
					String gender=urm.isSelected()?"Male":urf.isSelected()?"Female":"Trans";
					String dist=(String)udist.getSelectedItem();
					String listitem = (String)ulist.getSelectedValue();
					String add=uadd.getText();
					String c="";
					  if (uc1.isSelected()){
					        String c1=String.valueOf(uc1.getText());
					       c=c+" "+c1;
					    }
					    if (uc2.isSelected()){
					        String c2=String.valueOf(uc2.getText());
					        c=c+" "+c2;
					    }
					    if (uc3.isSelected()){
					        String c3=String.valueOf(uc3.getText());
					        c=c+" "+c3;
					    }
					    if (uc4.isSelected()){
					        String c4=String.valueOf(uc4.getText());
					        c=c+" "+c4;
					    }
					    
					    q10=con.prepareStatement("select * from problem_record where cname=?");
					    q10.setString(1,name);
					    ResultSet r8=q10.executeQuery();
					    int z=0;
					    while(r8.next())
					    {
					    	String x=r8.getString("problem");
					    	if(listitem.equals(x))
					    	{
					    		z=1;
					    		break;
					    	}
					    }
					    if(z==0)
					    {
					     
					    q7=con.prepareStatement("insert into problem_record(cname,contact_no,emial_id,gender,district,characteristics,problem,address) values(?,?,?,?,?,?,?,?)");
					    q7.setString(1, name);
						q7.setString(2, cn);
						q7.setString(3, em);
						q7.setString(4, gender);
						q7.setString(5, dist);
						q7.setString(6, c);
						q7.setString(7, listitem);
						q7.setString(8, add);
						q7.executeUpdate();	
						
						//table work
						
						/*
						 * q8=con.
						 * prepareStatement("SELECT cname,contact_no,emial_id,gender,district,characteristics,problem,address from problem_record"
						 * ); ResultSet r2=q8.executeQuery();
						 * 
						 * while(r2.next()) { String dname=r2.getString("cname"); if(name.equals(dname))
						 * { row[0]=r2.getString("cname"); row[1]=r2.getString("contact_no");
						 * row[2]=r2.getString("emial_id"); row[3]=r2.getString("gender");
						 * row[4]=r2.getString("district"); row[5]=r2.getString("characteristics");
						 * row[6]=r2.getString("problem"); row[7]=r2.getString("address");
						 * model.addRow(row); } }
						 */
						 
						q8=con.prepareStatement("SELECT * from problem_record where cname=? and problem=?");
						q8.setString(1, name);
						q8.setString(2, listitem);
						ResultSet r11=q8.executeQuery();
						r11.next();
						row[0]=r11.getString("cname"); row[1]=r11.getString("contact_no");
						  row[2]=r11.getString("emial_id"); row[3]=r11.getString("gender");
						  row[4]=r11.getString("district"); row[5]=r11.getString("characteristics");
						  row[6]=r11.getString("problem"); row[7]=r11.getString("address");
						  model.addRow(row);
						
						
						ucn.setText("");
						uemail.setText("");
						uadd.setText("");
						tabbedPane_1.setSelectedIndex(1);
					    }
					    else {
					    	JOptionPane.showMessageDialog(null,"You have already registered this problem statement");
					    }
					
				}catch (SQLException e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		usubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		usubmit.setBounds(793, 485, 100, 28);
		panel_10.add(usubmit);
		
		JButton btnNewButton_3 = new JButton("Logout");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
				
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(874, 37, 120, 35);
		panel_5.add(btnNewButton_3);
		
		// login
		
		JButton log_bt = new JButton("Login");
		log_bt.setFont(new Font("Tahoma", Font.BOLD, 12));
		log_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					if (log_name.getText().length()==0)
					  {
						JOptionPane.showMessageDialog(null, "Enter Username !!!");
					  }
					else if (log_phno.getText().length()==0)
					  {
						JOptionPane.showMessageDialog(null, "Enter PhoneNumber !!!");
					  }
					else if (log_pw.getText().length()==0)
					  {
						JOptionPane.showMessageDialog(null, "Enter password !!!");
					  }
					else {
							Connect();
							lname=log_name.getText();
							lphno=log_phno.getText();
							lpw=log_pw.getText();
							int c=1;
							int c1=1;
									q4=con.prepareStatement("SELECT username,phone_no,new_password from user_details");
									ResultSet r1=q4.executeQuery();
									while(r1.next())
									{
										//String s=r1.getString("username"); 
										String s1=r1.getString("phone_no");
										if(lphno.equals(s1))
										{
										c= 0;
										break;
										}
									}
									if(c==0)
									{
										String s=r1.getString("username"); 
										if(lname.equals(s))
										{
										c1 = 0;	
										}
									}
									if((c==0)&&(c1==0))
									{
										count3=1;
									
										String s2=r1.getString("new_password"); 
										if(lpw.equals(s2))
										{
											count3 = 0;	
										}
									if(count3==1)
									{
											String s=" Password Miss Match !!!";
											JOptionPane.showMessageDialog(null, s);
											log_pw.setText("");	
									}
									else 
									{		name=log_name.getText();
											layeredPane.removeAll();
											layeredPane.add(panel_5);
											layeredPane.repaint();
											layeredPane.revalidate();
											log_name.setText("");
											log_phno.setText("");
											log_pw.setText("");	
											user_lb.setText("Welcome "+lname+" !!!");
											panel_5.revalidate();
											panel_5.repaint();
											q8=con.prepareStatement("SELECT cname,contact_no,emial_id,gender,district,characteristics,problem,address from problem_record");
											ResultSet r2=q8.executeQuery();
											
											while(r2.next()) {
												String dname=r2.getString("cname");
												if(name.equals(dname)) {
													row[0]=r2.getString("cname");
													row[1]=r2.getString("contact_no");
													row[2]=r2.getString("emial_id");
													row[3]=r2.getString("gender");
													row[4]=r2.getString("district");
													row[5]=r2.getString("characteristics");
													row[6]=r2.getString("problem");
													row[7]=r2.getString("address");
													model.addRow(row);
												}
											}
										}
									}
					else{
						String s=" User Not Founded !!!";
						JOptionPane.showMessageDialog(null, s);
						log_name.setText("");
						log_phno.setText("");
						log_pw.setText("");	
	
					}
				}
				}
				catch (SQLException e1)
				{						
				}
				
			}
		});
		
		JButton btnNewButton_4_1 = new JButton("Add Another Response");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tabbedPane_1.setSelectedIndex(0);
				
			}
		});
		btnNewButton_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_4_1.setBounds(251, 464, 220, 35);
		panel_11.add(btnNewButton_4_1);
		
		log_bt.setForeground(new Color(255, 255, 255));
		log_bt.setBackground(new Color(255, 20, 147));
		log_bt.setBounds(341, 254, 107, 26);
		panel_9_1.add(log_bt);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(199, 10, 64, 63);
		panel_9_1.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\User-Coat-Red-icon.png"));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Phone_No");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(99, 131, 90, 34);
		panel_9_1.add(lblNewLabel_1_1_1);
		
		log_phno = new JTextField();
		log_phno.setColumns(10);
		log_phno.setBounds(250, 139, 150, 26);
		panel_9_1.add(log_phno);
		
		JCheckBox l_cb = new JCheckBox("");
		l_cb.setBounds(407, 175, 21, 26);
		panel_9_1.add(l_cb);
		l_cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(l_cb.isSelected()) {
					log_pw.setEchoChar((char)0);
				}else {
					log_pw.setEchoChar('⚫');
				}
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("User Login");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel_4.setBounds(391, 30, 165, 38);
		panel_7.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Create a new account !");
		lblNewLabel_1_2_2_1.setBackground(new Color(255, 240, 245));
		lblNewLabel_1_2_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_2_2_1.setBounds(350, 421, 145, 34);
		panel_7.add(lblNewLabel_1_2_2_1);
		
		JButton btnNewButton_5_1 = new JButton("Signup");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_5_1.setForeground(Color.BLACK);
		btnNewButton_5_1.setBackground(new Color(255, 240, 245));
		btnNewButton_5_1.setBounds(505, 429, 85, 21);
		panel_7.add(btnNewButton_5_1);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new CompoundBorder(new MatteBorder(3, 3, 1, 1, (Color) new Color(25, 25, 112)), null));
		panel_8.setBackground(new Color(240, 248, 255));
		tabbedPane.addTab("Admin Login", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBorder(new MatteBorder(1, 1, 3, 3, (Color) new Color(25, 25, 112)));
		panel_9_1_1.setBackground(new Color(240, 248, 255));
		panel_9_1_1.setBounds(235, 90, 481, 303);
		panel_8.add(panel_9_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Admin ID");
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(99, 85, 100, 34);
		panel_9_1_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Password");
		lblNewLabel_1_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_2_1_1.setBounds(99, 136, 126, 34);
		panel_9_1_1.add(lblNewLabel_1_2_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(250, 85, 150, 26);
		panel_9_1_1.add(textField_3);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(250, 136, 150, 26);
		panel_9_1_1.add(passwordField_2);
		
		JButton btnNewButton_2_1_1 = new JButton("GET_in");
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_12);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnNewButton_2_1_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1_1.setBackground(new Color(25, 25, 112));
		btnNewButton_2_1_1.setBounds(181, 216, 107, 26);
		panel_9_1_1.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(191, 12, 64, 63);
		panel_9_1_1.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setIcon(new ImageIcon("D:\\old\\College_life\\Clg_Studies\\sem5\\ajp\\projects\\pro_2\\src\\pro_2\\admin"));
		
		JCheckBox ad_cb = new JCheckBox("");
		ad_cb.setBounds(406, 136, 21, 26);
		panel_9_1_1.add(ad_cb);
		ad_cb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(ad_cb.isSelected()) {
					passwordField_2.setEchoChar((char)0);
				}else {
					passwordField_2.setEchoChar('⚫');
				}
			}
		});
		
		
		JLabel lblNewLabel_4_1 = new JLabel("Admin Login");
		lblNewLabel_4_1.setForeground(Color.GRAY);
		lblNewLabel_4_1.setFont(new Font("Georgia", Font.BOLD, 28));
		lblNewLabel_4_1.setBounds(364, 28, 192, 38);
		panel_8.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7_1_1.setBounds(669, 665, 328, 20);
		panel.add(lblNewLabel_7_1_1);
		lblNewLabel_7_1_1.setBackground(Color.PINK);
		lblNewLabel_7_1_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(205, 92, 92)));
		panel_4.setBackground(new Color(255, 240, 245));
		layeredPane.add(panel_4, "name_205104757510000");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Terms and Conditions of this site");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 40));
		lblNewLabel_5.setBounds(202, 52, 585, 68);
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("A Governing Law clause will inform users which laws govern the agreement.");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6.setBounds(99, 177, 781, 45);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("These laws should come from the country in which your company is headquartered");
		lblNewLabel_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_1.setBounds(99, 216, 843, 45);
		panel_4.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("or the country from which you operate your website and mobile app.");
		lblNewLabel_6_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_1_1.setBounds(99, 255, 781, 45);
		panel_4.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("A Limit What Users Can Do clause can inform users that by agreeing to use");
		lblNewLabel_6_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_2.setBounds(99, 341, 781, 45);
		panel_4.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("your service, they're also agreeing to not do certain things. This can be part");
		lblNewLabel_6_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_2_1.setBounds(99, 380, 781, 45);
		panel_4.add(lblNewLabel_6_2_1);
		
		JLabel lblNewLabel_6_2_2 = new JLabel("of a very long and thorough list in your Terms and Conditions agreement so as to");
		lblNewLabel_6_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_2_2.setBounds(99, 424, 828, 45);
		panel_4.add(lblNewLabel_6_2_2);
		
		JLabel lblNewLabel_6_2_3 = new JLabel("encompass the most amount of negative uses.");
		lblNewLabel_6_2_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_6_2_3.setBounds(99, 462, 781, 45);
		panel_4.add(lblNewLabel_6_2_3);
		
		JLabel lblNewLabel_7 = new JLabel("This Project is build by Archana S & Harisudhan S");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_7.setBounds(582, 626, 399, 28);
		panel_4.add(lblNewLabel_7);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Home");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Info");
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
		    }
		});

		
		JMenu mnNewMenu_1 = new JMenu("Login");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_1.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Sign Up");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				tabbedPane.setSelectedIndex(0);
		    }
		});

		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Login");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				tabbedPane.setSelectedIndex(1);
		    }
		});

		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Admin Login");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel);
				layeredPane.repaint();
				layeredPane.revalidate();
				tabbedPane.setSelectedIndex(2);
		    }
		});
		
		JMenu mnNewMenu_2 = new JMenu("Terms & Conditions");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_2.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("About");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel_4);
				layeredPane.repaint();
				layeredPane.revalidate();
		    }
		});
		
		JMenu mnNewMenu_3 = new JMenu("Quit");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		mnNewMenu_3.setForeground(Color.BLACK);
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Move to Home");
		mnNewMenu_3.add(mntmNewMenuItem_5);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	layeredPane.removeAll();
				layeredPane.add(panel_2);
				layeredPane.repaint();
				layeredPane.revalidate();
		    }
		});
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Close all");
		mnNewMenu_3.add(mntmNewMenuItem_6);
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent ev) {
		    	System.exit(0);
		    }
		});
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		
		JButton udelete = new JButton("Delete Selected Record");
		udelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int row = ctable.getSelectedRow();
		        int column = ctable.getSelectedColumn();
		        String valueInCell_1 = (String)ctable.getValueAt(row, 0);
		        String valueInCell_2 = (String)ctable.getValueAt(row, 6);
		        q11=con.prepareStatement("Delete from problem_record where cname=? and problem=?");
		        q11.setString(1,valueInCell_1);
		        q11.setString(2,valueInCell_2);
				q11.executeUpdate();
		        int udelete=ctable.getSelectedRow();
				model.removeRow(udelete);
				JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
				}
				catch(Exception q) {
					System.out.println(q);
				}
		        
			}
		});
		udelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		udelete.setBounds(527, 464, 220, 35);
		panel_11.add(udelete);
	}
}
