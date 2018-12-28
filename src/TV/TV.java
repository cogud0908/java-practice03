package TV;

class TV {

	// 파워가 유지되고 있을 때 채널과 볼륨이 작동한다.
	// 채널은 0~50번 채널까지 51번이면 1번으로 출력
	// 볼륨은 0~50까지

	private boolean power;
	private int channel;
	private int volume;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void power(boolean on) {
		if (on)
			power = true;
		else
			power = false;
	}

	public void channel(int channel) {
		if (power) {
			if (channel > 50 || channel < 0)
				System.out.println("채널이 없습니다.");
			else
				this.channel = channel;
		} else
			System.out.println("전원이 꺼져있습니다.");
	}

	public void channel(boolean upDown) {
		if (power) {
			if (upDown) {
				if (channel == 50)
					channel = 0;
				else
					channel++;
			} else if (channel == 0)
				channel = 50;
			else
				channel--;
		} else
			System.out.println("전원이 꺼져있습니다.");
	}

	public void volume(int channel) {
		if (power) {
			if (channel > 50 || channel < 0) {
				System.out.println("볼륨은 0~50으로 설정해주세요.");
				return;
			} else
				this.channel = channel;
		} else
			System.out.println("전원이 꺼져있습니다.");
	}

	public void volume(boolean upDown) {
		if (power) {
			if (upDown)
			{
				if(volume > 50)
					System.out.println("최대 볼륨입니다.");
				else
				volume++;
			}
			else
			{
				if(volume > 50)
					System.out.println("최저 볼륨입니다.");
				else
				volume--;
			}
		} else
			System.out.println("전원이 꺼져있습니다.");
	}

	public void status() {
		System.out.println("TV[power = " + true + ", channel = " + channel + " voulme = " + volume + "]");
	}
}
