package tetris3;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

public class Board {
	//보드의 세로길이
	public static int row=30;
	//보드의 가로길이
	public static int col=15;
	//보드의 색상배열 세로*가로의 크기
	public Color board[][];
	//보드에 출력한 블록
	public Block block;
	//보드 배경색상 지정
	public Color bgColor=Color.black;
	//현재 보드에 발생한 이벤트
	int key;
	
	public Board(){
		//가로 , 세로 크기 만큼 배열을 생성하고,
		board=new Color[row][col];
		//보드초기화
		initBoard();
		//블럭 초기화
		initBlock();
	}

	public void initBlock() {
		//랜덤으로 블럭을 하나 생성(0~6까지)
		int i=(int)(Math.random()*6+1);
		block=new Block(i);
		//블럭을 보드에 추가
		addBlock(block);
		//생성된 블럭정보 보기
		//System.out.println(block.toString());
	}
	//보드 초기화
	public void initBoard() {
		//배열크기만큼 배경색으로 보드를 초기화
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				board[i][j]=bgColor;
			}
		}
	}
    //보드에 생성된 블럭 추가한다. (보드에 블럭의 좌표를 가지고 해당색상으로 변환)
	public void addBlock(Block block){
		Point p;
		for(int i=0;i<4;i++){
			p=block.relative[i];
			if(block.absolute.y+p.y>=0)
				board[block.absolute.y+p.y][block.absolute.x+p.x]=block.color;
		}
	}
    //이벤트 발생시 블럭이 보드에 유효한지 체크
	public boolean preProcess(Block block) {
		Point p;
		Point ap=block.absolute;
		//블럭의 각 영역(블럭은 모두 4칸이다.) 체크
		for(int i=0;i<4;i++){
			p=block.getRelative(i);
			//블럭의 y좌표가 보드의 row보다 큰경우
			//블럭이 밑바닥에서 한칸 더 내려가려는 경우
			//현재 블럭은 종료하고 새블럭 생성 (true 리턴)
			if(ap.y+p.y>=row){
				System.out.println("블럭 놓임");
				//이전 블럭으로 복귀
				block.retutnBolck(key);
				return true;
			}
			//더이상 left,right,up이 될수 없는경우는 전 블록으로 복귀
			if(ap.x+p.x<0||ap.x+p.x>=col||ap.y+p.y<0){
				System.out.println("옆의 벽에 막힘");
				//x가 마이너스거나 col보다 큰경우, y가 마이너스인 경우는는 전 블록위치로 복귀
				block.retutnBolck(key);
				return false;
			}
            //이동하려는 곳이 이미 다른 블럭이 있는경우
			if(board[ap.y+p.y][ap.x+p.x]!=bgColor){
				//VK_DOWN키가 이벤트를 발생시켰을때 
				//다른 블럭이 밑에 있는곳에서 VK_DOWN이벤트가 발생하였다면
				//현재 블럭은 종료되고, 새블럭 생성(true 리턴)
				if(key==KeyEvent.VK_DOWN){
					System.out.println("블럭 위에 블럭 놓임");
					block.retutnBolck(key);
					return true;
				//VK_DOWN이 아닌 다른경우면 원래 모양복귀
				//이동하려는 좌우에 벽이 아닌 다른 블럭이 있는경우
				}else{
					block.retutnBolck(key);
					return false;
				}
			}
		}
		//전처리 할대상이 없다면, 블록은 계속 진행
		return false;
	}
    //한 라인이 배경색이 아닌 색으로 체워저 있다면, 그 라인을 삭제한다.
	public void checkLine() {
		System.out.println("라인 체크");
		for(int i=0;i<row;i++){
			int count=0;
			for(int t=0;t<col;t++){
				if(board[i][t]!=bgColor)
					count++;
			}
			if(count==col)
				deleteLine(i);
		}

	}
	//해당 라인은 위의 라인으로 체우고 맨위 라인은 배경색으로 채운다.
	private void deleteLine(int n) {
		System.out.println("라인 1줄 삭제");
		for(int i=n;i>0;i--){
			for(int t=0;t<col;t++){
				board[i][t]=board[i-1][t];
			}
		}
		for(int i=0;i<col;i++){
			board[0][i]=bgColor;
		}

	}
    //보드에서 현재 블럭을 삭제한다.
	//블럭의 위치의 색상을 배경색으로 변경한다.
	public void removeBlock(Block block){
		Point ap=block.absolute;
		for(int i=0;i<4;i++){
			Point p=block.relative[i];
			board[ap.y+p.y][ap.x+p.x]=bgColor;
		}
	}



}