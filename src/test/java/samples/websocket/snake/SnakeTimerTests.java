package samples.websocket.snake;

import java.io.IOException;

import org.junit.Test;

import samples.websocket.snake.Snake;
import samples.websocket.snake.SnakeTimer;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.willThrow;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;

public class SnakeTimerTests {

	@Test
	public void removeDysfunctionalSnakes() throws Exception {
		Snake snake = mock(Snake.class);
		willThrow(new IOException()).given(snake).sendMessage(anyString());
		SnakeTimer.addSnake(snake);

		SnakeTimer.broadcast("");
		assertThat(SnakeTimer.getSnakes()).hasSize(0);
	}
}
