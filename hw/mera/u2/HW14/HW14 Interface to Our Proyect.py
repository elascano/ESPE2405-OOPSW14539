import tkinter as tk
from tkinter import messagebox

def register_grades():
    try:
        quimester = selected_quimester.get()
        tasks = float(entry_tasks.get())
        individual_activities = float(entry_individual_activities.get())
        group_activities = float(entry_group_activities.get())
        lessons = float(entry_lessons.get())
        quimestral_exams = float(entry_quimestral_exams.get())

        messagebox.showinfo("Success", f"Grades registered successfully for {quimester}!")
    except ValueError:
        messagebox.showerror("Input Error", "Please enter valid decimal numbers for all grades.")

# Crea la ventana principal
root = tk.Tk()
root.title("Grades")

selected_quimester = tk.StringVar(value="Quimester I")
quimester_label = tk.Label(root, text="Select Quimester:")
quimester_label.grid(row=0, column=0, padx=10, pady=5, sticky="e")
quimester_menu = tk.OptionMenu(root, selected_quimester, "Quimester I", "Quimester II")
quimester_menu.grid(row=0, column=1, padx=10, pady=5, sticky="w")

labels_texts = ["Tasks", "Individual Activities", "Group Activities", "Lessons", "Quimestral Exams"]
entries = {}

for i, label_text in enumerate(labels_texts):
    label = tk.Label(root, text=label_text)
    label.grid(row=i+1, column=0, padx=10, pady=5, sticky="e")
    entry = tk.Entry(root)
    entry.grid(row=i+1, column=1, padx=10, pady=5)
    entries[label_text.lower().replace(" ", "_")] = entry

entry_tasks = entries["tasks"]
entry_individual_activities = entries["individual_activities"]
entry_group_activities = entries["group_activities"]
entry_lessons = entries["lessons"]
entry_quimestral_exams = entries["quimestral_exams"]

register_button = tk.Button(root, text="Register Grades", command=register_grades)
register_button.grid(row=len(labels_texts) + 1, column=0, columnspan=2, pady=10)

root.mainloop()
