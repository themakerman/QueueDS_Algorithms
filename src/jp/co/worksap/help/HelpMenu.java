package jp.co.worksap.help;

import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class HelpMenu extends JFrame {
	public HelpMenu() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent event) {
				JOptionPane.showMessageDialog(null, "The Steps can be viewed again by clicking on Help button.");
			}
		});
		setTitle("Information ");
		setBounds(new Rectangle(350, 290, 0, 0));
		getContentPane().setLayout(null);
		
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 504, 316);
		getContentPane().add(desktopPane);
		
		JLabel lblFollowingStepsShould = new JLabel("Following Steps Should be Followed for Algorithm to Work :-");
		lblFollowingStepsShould.setForeground(Color.WHITE);
		lblFollowingStepsShould.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblFollowingStepsShould.setBounds(55, 76, 406, 29);
		desktopPane.add(lblFollowingStepsShould);
		
		JLabel lblStep = new JLabel("1) Insert Into the Immutable Queue by using the add items");
		lblStep.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblStep.setForeground(Color.WHITE);
		lblStep.setBounds(55, 116, 422, 21);
		desktopPane.add(lblStep);
		
		JLabel lblButton = new JLabel("button.");
		lblButton.setForeground(Color.WHITE);
		lblButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblButton.setBounds(65, 133, 76, 21);
		desktopPane.add(lblButton);
		
		JLabel lblCopyThe = new JLabel("2) Copy the Immutable Queue Items to Secondary Queue By");
		lblCopyThe.setForeground(Color.WHITE);
		lblCopyThe.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblCopyThe.setBounds(55, 165, 422, 21);
		desktopPane.add(lblCopyThe);
		
		JLabel lblOnceCopied = new JLabel("3) Once Copied now you can perform the other operations");
		lblOnceCopied.setForeground(Color.WHITE);
		lblOnceCopied.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblOnceCopied.setBounds(55, 216, 422, 21);
		desktopPane.add(lblOnceCopied);
		
		JLabel lblLikeEnqueuedequeuepeaksize = new JLabel("Using other buttons.\r\n");
		lblLikeEnqueuedequeuepeaksize.setForeground(Color.WHITE);
		lblLikeEnqueuedequeuepeaksize.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblLikeEnqueuedequeuepeaksize.setBounds(65, 235, 149, 13);
		desktopPane.add(lblLikeEnqueuedequeuepeaksize);
		
		JLabel lblCopyItemsButton = new JLabel("Copy items button.\r\n");
		lblCopyItemsButton.setForeground(Color.WHITE);
		lblCopyItemsButton.setFont(new Font("Stencil", Font.PLAIN, 12));
		lblCopyItemsButton.setBounds(65, 184, 130, 21);
		desktopPane.add(lblCopyItemsButton);
	}
}
