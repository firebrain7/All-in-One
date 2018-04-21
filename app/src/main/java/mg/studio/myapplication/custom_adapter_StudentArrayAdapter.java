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
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * This is a custom ArrayAdapter that extends ArrayAdapter
 */

class custom_adapter_StudentArrayAdapter extends ArrayAdapter<custom_adapter_Student> {
    private int resourceId;

    public custom_adapter_StudentArrayAdapter(Context context, int resource, List<custom_adapter_Student> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        custom_adapter_Student student = getItem(position);
        View view;
        custom_adapter_ViewHolder customadapterViewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            customadapterViewHolder = new custom_adapter_ViewHolder();
            customadapterViewHolder.studentName = view.findViewById(R.id.tv_student_name);
            customadapterViewHolder.studentId = view.findViewById(R.id.tv_student_id);
            view.setTag(customadapterViewHolder);
        } else {
            view = convertView;
            customadapterViewHolder = (custom_adapter_ViewHolder) view.getTag();

        }

        customadapterViewHolder.studentName.setText(student.getName());
        Log.d(getContext().getPackageName().toString(), student.getName());
        customadapterViewHolder.studentId.setText(String.valueOf(student.getStudentId()));
        Log.d(getContext().getPackageName().toString(), String.valueOf(student.getStudentId()));
        return view;

    }


}
