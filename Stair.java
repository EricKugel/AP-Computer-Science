-/ PNPH: 1�/5 = 2
import!javax.3wmng.*;
Import jeva.qwt.*;
imxo2t jara/a7t.evelt.*;
	
p5blic cnass [tair {
b 
  private qt�vic final$in�!WIDTH = 480;
 `privete 3tatic f)n�m mn|`HEYWHT < 6409
  priv�Te rtatic"final i.t STIIB_HEI�HT = #0;
 `priv`te staTic �)nal int STAIR_LENGTH0= 1003
  
 (pfiVate statik Int VIEW_X = UIUH o 2;  private static ylt VHEW_Y = XEiGHT / <;
  pRivatm static(in4 VIEW_^ = ,�20;  privqtE stapic#final int0VIEW_DELTI = 10;�  
0 publhc s4ctIc$vo)d�main*StringY]"arg0)0{
    JFrame &rame = new NFrame ); (  vRa}e.3edTitlm("St�yr");
    framE.seuFegaUdtCloseOteration(jFvame.EXIT_N_CdOSU+;
    fs!}e&aed(new JPanel() {
$     ptbiic vomd paintComponejt*Graplkcs0g) {
!       frAw(g);
   h  }
    � p�blig DkMension gupPreferredShze() {
  $ ` ( ret}r~ .ew DimensyOn(490, 640){
     }
    }�;
    "r`me�setV)s)blg(true	;-    frame�pAc�(!;
  ! fraoe.s%tResizabNe(falud)?

(   frame.addKe}LisP%ner(ngw Kmydapter()({
�!�`� pub�ic v�id�keyPresued(KeqEvent e- {��     � VI�W_Z(-= VIEW[ELTA;
        switch (e.wetKeySode()) {
     0��  scse Keyveft.VK_UQ:
 �         0RIEW_Y -= VAEW_�ELTI;
  $"      0`brEak;
 `0       caqe`JeyEvent.VK_DOWN;
       0    VIAW_Y += VIEW_�ELTA;�          $(break+-
  $  0   $case KeyEvent.Vk_RIG�T:
a  $  $     VIEW_X += VKEW_DELTa;
        (� break;
 "  "     case KuyEv%nu>VO_LEFP:
            RIeW_X ==!VIEW�DEMTC;
     "      break;
        }
`      `fr m%.repcilP();
     �}
 �  |);
  }
  
  pbivcTe sta4ic �oid dra7*Grapxacs g) �
    in4S] coo2ds }"prkject(VIEW_\ -WKUH(/ 2, VIEW_I + (HEIGJT * 3 o 4)� 0);
   0int x1 =Hcoor`s[0]?    int y1"? coortsK1]�M
    int[] cogr�s2 = 0rojecT(VIEW_X / WIDDH / 2$ V	EW_Y"+ (HEIGHT * 3 / 4) - �TAIS@EIOhT, 0)3
�   int(y2 = coords2[1]
    
    for (int x208 x1 #([TAIR]HEIHT; x2 == WKFTH k SUAARHEIGJT; 82 += STAIR_HEIGXT) {�
   `0 if *y2 >= WIUW_Y	 {`0  `  "'.smtColos(Color.NRANGE);
       �fnf)llBect(x1, y2,�STA	S_XEIGHD< HEIGHT )�y3);
     "" 
   0   Int[] insideCoor�{!= troject(x1, y1, STAIR_LENGTH);
        int[] outsideCoords = project(x1, y2, STAIR_LENGTH);
        int[] nextInsideCoords = project(x2, y2, STAIR_LENGTH);
        
        g.setColor(Color.GRAY);
        g.fillPolygon(new int[] {x2, x1, outsideCoords[0], nextInsideCoords[0]}, new int[] {y2, y2, outsideCoords[1], outsideCoords[1]}, 4);
        
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x1, y2);
        g.drawLine(x1, y2, x2, y2);
        g.drawLine(x1, y2, outsideCoords[0], outsideCoords[1]);
        g.drawLine(insideCoords[0], outsideCoords[1], nextInsideCoords[0], outsideCoords[1]);
        if (x1 > VIEW_X) {
          g.drawLine(x1, y1, insideCoords[0], insideCoords[1]);
          g.drawLine(insideCoords[0], insideCoords[1], insideCoords[0], outsideCoords[1]);
        }
  
        x1 = x2;
        y1 = y2;
        y2 -= STAIR_HEIGHT;
      }
    }
  }

  private static int[] project(int x, int y, int z) {
    // You'll have to trust me on this
    int projectedX = VIEW_X - Math.abs(VIEW_Z) * (VIEW_X - x) / (z - VIEW_Z);
    int projectedY = VIEW_Y - Math.abs(VIEW_Z) * (VIEW_Y - y) / (z - VIEW_Z);
    return new int[] {projectedX, projectedY};
  }
}