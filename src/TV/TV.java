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
				return;
			else if (channel >= 50)
				this.channel = 0;
			else if (channel < 0)
				this.channel = 50;
			else
				this.channel = channel;
		} 
	}

	public void channel(boolean upDown) {

		if (power) {
			if (upDown) {
				if (channel >= 50) {
					channel = 0;
				} else
					channel++;
			}
			else
			{
				if(channel == 0)
					channel = 50;
				else
				channel = 0;
			}
		} 
	}

	public void volume(int volume) {
		if (power) {
			if (volume >= 50) {
				this.volume = 0;
			} else
				this.volume = volume;
		} 
	}

	public void volume(boolean upDown) {
		if (power) {
			if (upDown) {
				if (volume >= 50) {
					volume = 0;					
				} else
					volume++;
			}
			else
			{
				if(volume == 0)
					volume = 50;
				else
					volume--;
			}
		} 
	}

	public void status() {
		System.out.println("TV[power = " + power + ", channel = " + channel + ", volume = " + volume + "]");
	}
}
