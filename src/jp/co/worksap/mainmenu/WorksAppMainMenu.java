package jp.co.worksap.mainmenu;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.NoSuchElementException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import jp.co.worksap.global.ImmutableQueue;
import jp.co.worksap.help.HelpMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class WorksAppMainMenu extends JFrame {
	
	//Immutable Queue Object Reference
	public ImmutableQueue<Object> q;	
	
	public WorksAppMainMenu() {
		
		//Allocating memory to the Queue Object
		q = new ImmutableQueue<>();
		
		setOpacity(0.97f);
		setTitle("IMMUTABLE FIFO");
		setBounds(new Rectangle(150, 150, 1150, 500));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu fileMenuBar = new JMenu("File");
		menuBar.add(fileMenuBar);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		fileMenuBar.add(mntmExit);
		
		JMenu editMenuBar = new JMenu("Edit");
		editMenuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "<html> <b>Only File and About Menubar Buttons are Active in this Version  </b> </html>");
			}
		});
		menuBar.add(editMenuBar);
		
		JMenu helpMenuBar = new JMenu("Search");
		helpMenuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "<html> <b>Only File and About Menubar Buttons are Active in this Version  </b> </html>");
			}
		});
		helpMenuBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
			}
		});
		menuBar.add(helpMenuBar);
		
		JMenu aboutMenuBar = new JMenu("About");
		menuBar.add(aboutMenuBar);
		
		JMenuItem mntmAboutMe = new JMenuItem("About Me");
		mntmAboutMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "<html><b>Name :- Gaurav Harchwani<br>Branch Of Engineering :- Computer Science (Computer Engineering) <br>Passout Year :- 2015(Expected) <br>College :- Watumull College Of Electronics Engineering and Computer Technology<br>University :- Mumbai University<br>Country :- India<br>Email :- gauravharchwani@yahoo.com<br></b> </html>", "About me", JOptionPane.PLAIN_MESSAGE);
			}
		});
		aboutMenuBar.add(mntmAboutMe);
		getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 1129, 87);
		getContentPane().add(toolBar);
		
		JButton workApplicationsLogoButton = new JButton("Works Applications");
		workApplicationsLogoButton.setMargin(new Insets(10, 10, 10, 10));
		workApplicationsLogoButton.setFocusable(false);
		workApplicationsLogoButton.setForeground(Color.WHITE);
		workApplicationsLogoButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		workApplicationsLogoButton.setSelected(true);
		workApplicationsLogoButton.setMaximumSize(new Dimension(170, 72));
		toolBar.add(workApplicationsLogoButton);
		
		JButton addItemsButton = new JButton("Add Items");
		addItemsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try{
					Object element = JOptionPane.showInputDialog(null, "Enter the item to be added :- ", "Add Items", JOptionPane.PLAIN_MESSAGE);
					if(q.addItemsToImmutableQueue(element) && element != null){
						JOptionPane.showMessageDialog(null, "Successfully Entered :- "+element);
					}
				}catch(IllegalArgumentException e){
					
				}
			}
		});
		addItemsButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		addItemsButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		addItemsButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/shop-cart-add-icon (1).png")));
		addItemsButton.setMaximumSize(new Dimension(170, 72));
		toolBar.add(addItemsButton);
		
		JButton copyItemsButton = new JButton("Copy Items");
		copyItemsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				if(q.copyContentsOfImmutableQueueToSecondary()){
					JOptionPane.showMessageDialog(null, "SuccessFully Copied");
				}else{
					JOptionPane.showMessageDialog(null, "Error occured while copying or no items to copy");
				}
			}
		});
		copyItemsButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		copyItemsButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/postage_stamp.png")));
		copyItemsButton.setMaximumSize(new Dimension(170, 72));
		copyItemsButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		toolBar.add(copyItemsButton);
		
		JButton getSizeButton = new JButton("Get Size");
		getSizeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) { 
				JOptionPane.showMessageDialog(null, "The Size of Queue is :- "+q.size(), "QueueSize", JOptionPane.PLAIN_MESSAGE);
			}
		});
		toolBar.add(getSizeButton);
		getSizeButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		getSizeButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/kruler (1).png")));
		getSizeButton.setMaximumSize(new Dimension(177, 72));
		getSizeButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		
		JButton printSecondaryQueueButton = new JButton("printSecondaryQueue");
		printSecondaryQueueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Queue is :- "+q.secondaryQueue, "Print Queue", JOptionPane.PLAIN_MESSAGE);
			}
		});
		printSecondaryQueueButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/monitor.png")));
		printSecondaryQueueButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		printSecondaryQueueButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		printSecondaryQueueButton.setMaximumSize(new Dimension(210, 72));
		toolBar.add(printSecondaryQueueButton);
		
		JButton printPrimaryQueueButton = new JButton("printImmutableQueue");
		printPrimaryQueueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JOptionPane.showMessageDialog(null, "Queue is :- "+q.immutableQueue, "Print Queue", JOptionPane.PLAIN_MESSAGE);
			}
		});
		printPrimaryQueueButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		printPrimaryQueueButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/Monitor-icon.png")));
		printPrimaryQueueButton.setMaximumSize(new Dimension(210, 72));
		printPrimaryQueueButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		toolBar.add(printPrimaryQueueButton);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setOrientation(SwingConstants.VERTICAL);
		toolBar_1.setBounds(0, 92, 185, 346);
		getContentPane().add(toolBar_1);
		
		JButton enqueueButton = new JButton("Enqueue");
		enqueueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try{
					Object element = JOptionPane.showInputDialog(null, "Enter the item to be added :- ", "Add Items", JOptionPane.PLAIN_MESSAGE);
					q.enqueue(element);
					if(q.enqueueSuccess){
						JOptionPane.showMessageDialog(null, "Successfully Entered Element :- "+element);
					}else{
						JOptionPane.showMessageDialog(null, "Enqueue Operation Unsucessfull");
					}
				}catch(IllegalArgumentException e){
					
				}				
			}
		});
		enqueueButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/Log-Out-icon.png")));
		enqueueButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		enqueueButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		enqueueButton.setMaximumSize(new Dimension(185, 85));
		toolBar_1.add(enqueueButton);
		
		JButton dequeueButton = new JButton("Dequeue");
		dequeueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try{
					q.dequeue();
					if(q.dequeueSuccess){
						JOptionPane.showMessageDialog(null, "The Dequeued element is :- "+q.dequeuedObject);
					}else{
						JOptionPane.showMessageDialog(null, "Error Occured while dequeueing.Please try Again");
					}
				}catch(NoSuchElementException e){
					JOptionPane.showMessageDialog(null, "Queue is Empty.There is Nothing to Dequeue");
				}				
			}
		});
		dequeueButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/1409141432_logout-48.png")));
		dequeueButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		dequeueButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		dequeueButton.setMaximumSize(new Dimension(185, 85));
		toolBar_1.add(dequeueButton);
		
		JButton peakButton = new JButton("Peak");
		peakButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					JOptionPane.showMessageDialog(null, "Peak Element is :- "+q.peek());
				} catch (NoSuchElementException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "No element at peak.Queue is empty");
				}
			}
		});
		peakButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/Hands-One-Finger-icon.png")));
		peakButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		peakButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		peakButton.setMaximumSize(new Dimension(185, 85));
		toolBar_1.add(peakButton);
		
		JButton helpButton = new JButton("Help");
		helpButton.addActionListener(new ActionListener() {
			HelpMenu hm = new HelpMenu();
			public void actionPerformed(ActionEvent arg0) {
				if(hm.isActive() == false){
					hm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					hm.setVisible(true);
					hm.setSize(700, 355);
				}
			}
		});
		helpButton.setIcon(new ImageIcon(WorksAppMainMenu.class.getResource("/jp/co/worksap/mainmenu/Button-Help-icon (2).png")));
		helpButton.setFont(new Font("Snap ITC", Font.PLAIN, 12));
		helpButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		helpButton.setMaximumSize(new Dimension(185, 85));
		toolBar_1.add(helpButton);
	}
}
