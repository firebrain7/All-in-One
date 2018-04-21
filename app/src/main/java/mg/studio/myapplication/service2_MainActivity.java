package mg.studio.myapplication;

/**
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 *
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class service2_MainActivity extends AppCompatActivity implements Runnable {
    Handler handler = new Handler();
    private int counterActivity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.service2_activity_main);

    }

    public void btnStart(View view) {
        Intent intent = new Intent(this, service2_MyService.class);
        startService(intent);
        Log.d(service2_MyService.LOG_TAG, "Button start Service pressed");
        handler.post(this);


    }

    public void btnEnd(View view) {
        Intent intent = new Intent(this, service2_MyService.class);
        stopService(intent);
    }

    @Override
    public void run() {
        counterActivity++;
        Log.d(service2_MyService.LOG_TAG, "Counter Activity "+counterActivity);
        handler.postDelayed(this, 1000);
    }
}
