
// Give more country as an input
// modify some gui 


public class CurrencyConverter extends javax.swing.JFrame {
double USA = 1.00;
double Nigeria = 766.00;
double Brazil = 5.13;
double Canada = 1.37;
double Kenyan = 148.40;
double Indonesia = 15606.00;
double India = 83.23;
double Philippine = 56.84;
double Pakistan = 286.88;
double Russia = 95.98;
double Singapore = 1.37;
double China = 7.20;
double Australia = 1.59;
double Japan = 149.00;
double France = 0.96;
double Germany = 0.96;
double Italy = 0.94;
double Spain = 0.94;
double Greece = 0.94;
double Mexico = 18.16;
double Egypt = 30.66;
double SouthAfrica =19.32 ;
double Malaysia = 4.73;
double Thailand = 36.94;
double Vietnam = 24385.00;
double SouthKorea = 1344.36;
double Turkey = 27.62;
double Iran = 42232.50;
double Iraq = 1304.22;
double SaudiArabia = 3.75 ;

String[] currencyUnits = {
"Units",
"$",
"₦",
"R$",
"C$",
"KES",
"Rp",
"₹",
"₱",
"Rs",
"₽" ,
"S$" ,
"¥" ,
 "$",
 "¥",
 "₣",
 "€",
 "€",
 "€",
 "SaudiArebia",
 "Dinar",
 "Rial",
 "Turkey",
 "SouthKorea",
 "Vietnam",
 "Thailand",
 "Malaysia",
 "SouthAfrica",
 "Egypt",
 "Mexico",
 "Greece"
};
  
    public CurrencyConverter() {
        initComponents();
    }

   
   
 
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<>();
        secondCountry = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        secondCurrencyUnit = new javax.swing.JLabel();
        firstCurrencyUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
       

   


        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(67, 222, 217), 7));
        jPanel1.setBackground(new java.awt.Color(67, 222, 217));


       
        jLabel1.setFont(new java.awt.Font("Times New Roman",1, 24));

        jLabel1.setText("World Currency Convertor(By Nikhil)");

        firstCountry.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Country", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan","Russia","Singapore" ,"China" ,"Australia","Japan","France","Germany","Italy","Spain","SaudiArebia","Iraq","Iran",
 "Turkey",
 "SouthKorea",
 "Vietnam",
 "Thailand",
 "Malaysia",
 "SouthAfrica",
 "Egypt",
 "Mexico",
 "Greece" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Country", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "Indonesia", "India", "Philippine", "Pakistan","Russia" ,"Singapore" ,"China" ,"Australia","Japan","France","Germany","Italy","Spain","SaudiArebia","Iraq","Iran","Turkey","SouthKorea","Vietnam","Thailand","Malaysia","SouthAfrica","Egypt","Mexico","Greece"}));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel2.setText("This Country");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel3.setText("To This Country");

        t1.setFont(new java.awt.Font("Times New Roman", 1, 24)); 

        t2.setFont(new java.awt.Font("Times New Roman", 1, 24)); 

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jButton1.setText("Convert It");
       jButton1.setBackground(new java.awt.Color(2, 247, 11));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jButton2.setText("Try New");
        jButton2.setBackground(new java.awt.Color(246, 250, 15));
       
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jButton3.setText("Go Back");
         jButton3.setBackground(new java.awt.Color(222, 67, 67));
        //   jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 67, 67), 10));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        secondCurrencyUnit.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        secondCurrencyUnit.setText("Units");

        firstCurrencyUnit.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        firstCurrencyUnit.setText("Units");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(firstCountry, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(secondCountry, 0, 272, Short.MAX_VALUE)
                                .addComponent(t2))
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton2)
                        .addGap(94, 94, 94)
                        .addComponent(jButton3)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(secondCountry))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(t2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
        
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        firstCountry.setSelectedIndex(0);
        secondCountry.setSelectedIndex(0);
        t1.setText("");
        t2.setText("");
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
     {

       
        double amountToChange=Double.parseDouble(t1.getText());
        double amountChanged=0.0;
        double amountInPounds=0.0;
        
      switch(firstCountry.getSelectedItem().toString())
        {
        case "USA": amountInPounds = amountToChange/USA;break;
	case "Nigeria":amountInPounds = amountToChange/Nigeria;break;
	case "Brazil":amountInPounds = amountToChange/Brazil;break;
	case "Canada":amountInPounds = amountToChange/Canada;break;
	case "Kenyan":amountInPounds = amountToChange/Kenyan;break;
	case "Indonesia":amountInPounds = amountToChange/Indonesia;break;
	case "India":amountInPounds = amountToChange/India;break;
	case "Philippine":amountInPounds = amountToChange/Philippine;break;
	case "Pakistan":amountInPounds = amountToChange/Pakistan;break;
    case "Russia": amountInPounds = amountToChange/Russia;break;
case "Singapore" :amountInPounds=amountToChange/Singapore ;break; 
case "China"     :amountInPounds=amountToChange/ China; break;            
 case "Australia"   : amountInPounds = amountToChange/ Australia;break;
 case "Japan"       : amountInPounds = amountToChange/ Japan;break;
 case "France"      : amountInPounds = amountToChange/France ;break;
 case "Germany"     : amountInPounds = amountToChange/Germany ;break;
 case "Italy"       : amountInPounds = amountToChange/ Italy;break;
 case "Spain"       : amountInPounds = amountToChange/ Spain;break;
 case "SaudiArebia" : amountInPounds = amountToChange/ SaudiArabia;break;
 case "Iraq"        : amountInPounds = amountToChange/ Iraq;break;
 case "Iran"        : amountInPounds = amountToChange/ Iran;break;
 case "Turkey"      : amountInPounds = amountToChange/ Turkey;break;
 case "SouthKorea"  : amountInPounds = amountToChange/ SouthKorea;break;
 case "Vietnam"     : amountInPounds = amountToChange/ Vietnam;break;
 case "Thailand"    : amountInPounds = amountToChange/ Thailand;break;
 case "Malaysia"    : amountInPounds = amountToChange/Malaysia ;break;
 case "SouthAfrica" : amountInPounds = amountToChange/ SouthAfrica;break ;
 case "Egypt"      : amountInPounds = amountToChange/ Egypt;break;
 case "Mexico"     : amountInPounds = amountToChange/Mexico;break;
 case "Greece"     : amountInPounds = amountToChange/ Greece;break;
	default:amountInPounds = 0.0;
        }

       
        
        switch(secondCountry.getSelectedItem().toString())
        {
        case "USA":amountChanged = amountInPounds * USA;break;
	case "Nigeria":amountChanged = amountInPounds * Nigeria;break;
	case "Brazil":amountChanged = amountInPounds * Brazil;break;
	case "Canada":amountChanged = amountInPounds * Canada;break;
	case "Kenyan":amountChanged = amountInPounds * Kenyan;break;
	case "Indonesia":amountChanged = amountInPounds * Indonesia;break;
	case "India":amountChanged = amountInPounds * India;break;
	case "Philippine":amountChanged = amountInPounds * Philippine;break;
	case "Pakistan":amountChanged = amountInPounds * Pakistan;break;
    case "Russia": amountChanged = amountInPounds * Russia;break;

case "Singapore" :amountChanged=amountChanged*Singapore ;break; 
case "China"     :amountChanged=amountInPounds* China; break;            
 case "Australia"   : amountChanged= amountInPounds*Australia;break;
 case "France"      : amountChanged = amountInPounds* France ;break;
 case "Germany"     :  amountChanged= amountInPounds*Germany ;break;
 case "Japan"       : amountChanged = amountInPounds*Japan;break;
 case "Italy"       : amountChanged = amountInPounds*Italy;break;
 case "Spain"       : amountChanged = amountInPounds*Spain;break;
 case "SaudiArebia" : amountChanged = amountInPounds*SaudiArabia;break;
 case "Iraq"        : amountChanged = amountInPounds*Iraq;break;
 case "Iran"        : amountChanged = amountInPounds*Iran;break;
 case "Turkey"      : amountChanged = amountInPounds*Turkey;break;
 case "SouthKorea"  : amountChanged = amountInPounds*SouthKorea;break;
 case "Vietnam"     : amountChanged = amountInPounds*Vietnam;break;
 case "Thailand"    : amountChanged = amountInPounds*Thailand;break;
 case "Malaysia"    : amountChanged = amountInPounds*Malaysia ;break;
 case "SouthAfrica" : amountChanged = amountInPounds*SouthAfrica;break ;
 case "Egypt"      : amountChanged = amountInPounds * Egypt;break;
 case "Mexico"     : amountChanged = amountInPounds* Mexico;break;
 case "Greece"     : amountChanged = amountInPounds*Greece;break;
	default:amountChanged = amountInPounds * 0.0;
        }
        
        String value = String.format("%.2f",amountChanged);
         
        t2.setText(value);
        
    }

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
      
    }

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged
        firstCurrencyUnit.setText(currencyUnits[firstCountry.getSelectedIndex()]);
    }

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        secondCurrencyUnit.setText(currencyUnits[secondCountry.getSelectedIndex()]);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurrencyConverter().setVisible(true);
            }
        });
    }

   
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
   
}
